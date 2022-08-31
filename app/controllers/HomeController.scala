package controllers

import _root_.controllers.RoomForm._
import anorm._
import play.api._
import play.api.data.Forms._
import play.api.data._
import play.api.db._
import play.api.libs.concurrent.Execution.Implicits._
import play.api.mvc._

import javax.inject._

@Singleton //<-ひとつのクラスにつき、一つのインスタンスのみが生成可能なクラスであることを定義。
                      //↓情報を依存性注入によるクラスに組み込む。
class HomeController @Inject()(db: Database, cc: MessagesControllerComponents)
  extends MessagesAbstractController(cc) {

//全予約リスト一覧取得・表示
  def index() = {
    Action { implicit request =>
        //↓データベースへ接続する。
      db.withConnection { implicit conn =>
        //全予約リスト一覧取得
        val result: List[RoomData] =
          SQL("Select * from reserve order by sec")
                //↓RomForm.scalaで定義したSQLパーサー。
            .as(roomparser.*)
        //テンプレートにデータを渡して全予約リスト一覧表示
        Ok(views.html.index(
          "現在の全予約リスト", result
        ))
      }
    }
  }

//IDで予約検索・表示
  def show(tid: Int) = Action { implicit request =>
       //↓データベースへ接続する。
    db.withConnection { implicit conn =>
      //IDで予約検索
      val result: RoomData
      = SQL("Select * from reserve where id = {id}")
       //↓SQLテキストに用意したプレースホルダに値を設定する。
        .on("id" -> tid)
            //↓RomForm.scalaで定義したSQLパーサー。
        .as(roomparser.single)
      //テンプレートにデータを渡してIDで予約データ表示
      Ok(views.html.show(
        "予約済み内容です。", result, tid
      ))
    }
  }

//会議室予約
  def add() = Action { implicit request =>
    Ok(views.html.add(
      "",
      form
    ))
  }

  def create() = Action { implicit request =>
    val formdata = form.bindFromRequest
    //入力漏れがあった場合。
    if (formdata.hasErrors) {
      //テンプレートでエラー表示
      Ok(views.html.add("入力漏れがありました !", form))
    } else {
      //予約重複チェック
      val data2 = formdata.get
          //↓データベースへ接続する。
      db.withConnection { implicit conn =>
        val result: RoomData
        = SQL("SELECT * FROM reserve WHERE room={room} AND date={date} AND time={time}")
          //↓SQLテキストに用意したプレースホルダに値を設定する。
          .on(
            "room" -> data2.room,
            "date" -> data2.date,
            "time" -> data2.time
          )
              //↓RomForm.scalaで定義したSQLパーサー。
          .as(roomparser.single)

        if (result != null) {
          val tid: Int = result.id
          //テンプレートでエラー表示
          Ok(views.html.show("入力された会議室と日時は下記のように予約済みです。", result, tid))
        } else {
          //入力漏れが無い場合はデータ保存。
          val data = formdata.get
             //↓データベースへ接続する。
          db.withConnection { implicit conn =>
            SQL("insert into reserve values (default, {room}, {date}, {time}, {name}, {sec}, {pri})")
              //↓SQLテキストに用意したプレースホルダに値を設定する。
              .on(
                "room" -> data.room,
                "date" -> data.date,
                "time" -> data.time,
                "name" -> data.name,
                "sec" -> data.sec,
                "pri" -> data.pri
              ).executeInsert()
            Redirect(routes.HomeController.index)
          }
        }
      }
    }
  }

  //修正頁呼ぶ前に予約番号を入力してもらうための頁
  def edit() = Action { implicit request =>
    Ok(views.html.edit(
      "",
      form
    ))
  }

  //予約データ編集1
  def editB() = Action { implicit request =>
    var form1: Option[Map[String, Seq[String]]] =
                    //↓フォームの情報をエンコードし、Mapインスタンスとして返す。
      request.body.asFormUrlEncoded
                                              //↓Mapのキーに対応する値を取り出す。
    var param: Map[String, Seq[String]] = form1.getOrElse(Map())

    //番号未入力の対処
    if (param.get("id").get(0).isEmpty) {
      //テンプレートでエラー表示
      Ok(views.html.edit("番号が入力されていませんでした!", form))
    } else {
      var id: Int = param.get("id").get(0).toInt
      //テンプレートにデータを渡して表示
      Ok(views.html.edit2("", roomform, id))
    }
  }

  //予約データ編集2
  def edit2(id: Int) = Action { implicit request =>
    var formdata = roomform.bindFromRequest
       //↓データベースへ接続する。
    db.withConnection { implicit conn =>
      Ok(views.html.edit2(
        " ",
        formdata, id
      ))
    }
  }

  //予約データ更新
  def update(id: Int) = Action { implicit request =>
    val formdata = roomform.bindFromRequest
    //入力漏れがあった場合。
    if (formdata.hasErrors) {
      //テンプレートでエラー表示
      Ok(views.html.edit2("入力漏れがありました !", roomform, id))
    } else {
      //予約重複チェック
      val data2 = formdata.get
         //↓データベースへ接続する。
      db.withConnection { implicit conn =>
        val result: RoomData
        = SQL("SELECT * FROM reserve WHERE room={room} AND date={date} AND time={time}")
          //↓SQLテキストに用意したプレースホルダに値を設定する。
          .on(
            "room" -> data2.room,
            "date" -> data2.date,
            "time" -> data2.time
          )
              //↓RomForm.scalaで定義したSQLパーサー。
          .as(roomparser.single)

        if (result != null) {
          val tid: Int = result.id
          //テンプレートで表示
          Ok(views.html.show("入力された会議室と日時は下記のように予約済みです。", result, tid))
        } else {
          //入力漏れがなければデータ保存。
          val data = formdata.get
             //↓データベースへ接続する。
          db.withConnection { implicit conn =>
            val result = SQL("update reserve set room={room}, date={date}, time={time}, name={name}, sec={sec}, pri={pri} where id = {id}")
              //↓SQLテキストに用意したプレースホルダに値を設定する。
              .on(
                "room" -> data.room,
                "date" -> data.date,
                "time" -> data.time,
                "name" -> data.name,
                "sec" -> data.sec,
                "pri" -> data.pri,
                "id" -> data.id
              ).executeUpdate
            Redirect(routes.HomeController.index)
          }
        }
      }
    }
  }

  //削除頁呼ぶ前に予約番号を入力してもらうための頁
  def delete() = Action { implicit request =>
    Ok(views.html.delete(
      "",
      form
    ))
  }

  //予約データ削除準備
  def deleteB() = Action { implicit request =>
    var form1: Option[Map[String, Seq[String]]] =
                    //↓フォームの情報をエンコードし、Mapインスタンスとして返す。
      request.body.asFormUrlEncoded
                                                //↓Mapのキーに対応する値を取り出す。
    var param: Map[String, Seq[String]] = form1.getOrElse(Map())

    //番号未入力の対処
    if (param.get("id").get(0).isEmpty) {
      //テンプレートでエラー表示
      Ok(views.html.delete("番号が入力されていませんでした!", form))
    } else {
      var id: Int = param.get("id").get(0).toInt
      Redirect(routes.HomeController.delete2(id))
    }
  }

  //予約データ削除内容の表示
  def delete2(id: Int) = Action { implicit request =>
       //↓データベースへ接続する。
    db.withConnection { implicit conn =>
      val data: RoomData = SQL("select * from reserve where id={id}")
        //↓SQLテキストに用意したプレースホルダに値を設定する。
        .on("id" -> id)
            //↓RomForm.scalaで定義したSQLパーサー。
        .as(roomparser.single)
      //テンプレートで表示
      Ok(views.html.delete2(
        "該当予約内容です。",
        data, id
      ))
    }
  }

  //予約データを削除
  def remove(id: Int) = Action { implicit request =>
       //↓データベースへ接続する。
    db.withConnection { implicit conn =>
      val result = SQL("delete from reserve where id = {id}")
         //↓SQLテキストに用意したプレースホルダに値を設定する。
        .on("id" -> id)
        .executeUpdate
      Redirect(routes.HomeController.index)
    }
  }
}
