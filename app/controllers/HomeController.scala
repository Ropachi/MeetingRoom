package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import play.api.db._
import anorm._
import play.api.libs.concurrent.Execution.Implicits._
import play.api.mvc.Result
import RoomForm._

@Singleton
class HomeController @Inject()(db: Database, cc: MessagesControllerComponents)
  extends MessagesAbstractController(cc) {

  def index() = {
    Action { implicit request =>
      db.withConnection { implicit conn =>
        val result: List[RoomData] =
          SQL("Select * from reserve order by sec")
            .as(roomparser.*)
        Ok(views.html.index(
          "現在の全予約リスト", result
        ))
      }
    }
  }

  def show(tid: Int) = Action { implicit request =>
    db.withConnection { implicit conn =>
      val result: RoomData
      = SQL("Select * from reserve where id = {id}")
        .on("id" -> tid)
        .as(roomparser.single)
      Ok(views.html.show(
        "予約済み内容です。", result, tid
      ))
    }
  }

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
      Ok(views.html.add("入力漏れがありました !", form))
    } else {
      //予約重複チェック
      val data2 = formdata.get
      db.withConnection { implicit conn =>
        val result: RoomData
        = SQL("SELECT * FROM reserve WHERE room={room} AND date={date} AND time={time}")
          .on(
            "room" -> data2.room,
            "date" -> data2.date,
            "time" -> data2.time
          )
          .as(roomparser.single)

        if (result != null) {
          val tid: Int = result.id
          Ok(views.html.show("入力された会議室と日時は下記のように予約済みです。", result, tid))
        } else {
          //入力漏れが無い場合はデータ保存。
          val data = formdata.get
          db.withConnection { implicit conn =>
            SQL("insert into reserve values (default, {room}, {date}, {time}, {name}, {sec}, {pri})")
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

  //edit頁
  def editB() = Action { implicit request =>
    var form1: Option[Map[String, Seq[String]]] =
      request.body.asFormUrlEncoded
    var param: Map[String, Seq[String]] = form1.getOrElse(Map())

    //番号未入力の対処
    if (param.get("id").get(0).isEmpty) {
      Ok(views.html.edit("番号が入力されていませんでした!", form))
    } else {
      var id: Int = param.get("id").get(0).toInt
      Ok(views.html.edit2("", roomform, id))
    }
  }

  //修正頁
  def edit2(id: Int) = Action { implicit request =>
    var formdata = roomform.bindFromRequest
    db.withConnection { implicit conn =>
      Ok(views.html.edit2(
        " ",
        formdata, id
      ))
    }
  }

  def update(id: Int) = Action { implicit request =>
    val formdata = roomform.bindFromRequest
    //入力漏れがあった場合。
    if (formdata.hasErrors) {
      Ok(views.html.edit2("入力漏れがありました !", roomform, id))
    } else {
      //予約重複チェック
      val data2 = formdata.get
      db.withConnection { implicit conn =>
        val result: RoomData
        = SQL("SELECT * FROM reserve WHERE room={room} AND date={date} AND time={time}")
          .on(
            "room" -> data2.room,
            "date" -> data2.date,
            "time" -> data2.time
          )
          .as(roomparser.single)

        if (result != null) {
          val tid: Int = result.id
          Ok(views.html.show("入力された会議室と日時は下記のように予約済みです。", result, tid))
        } else {
          //入力漏れがなければデータ保存。
          val data = formdata.get
          db.withConnection { implicit conn =>
            val result = SQL("update reserve set room={room}, date={date}, time={time}, name={name}, sec={sec}, pri={pri} where id = {id}")
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

  //delete頁
  def deleteB() = Action { implicit request =>
    var form1: Option[Map[String, Seq[String]]] =
      request.body.asFormUrlEncoded
    var param: Map[String, Seq[String]] = form1.getOrElse(Map())

    //番号未入力の対処
    if (param.get("id").get(0).isEmpty) {
      Ok(views.html.delete("番号が入力されていませんでした!", form))
    } else {
      var id: Int = param.get("id").get(0).toInt
      Redirect(routes.HomeController.delete2(id))
    }
  }

  //削除頁2
  def delete2(id: Int) = Action { implicit request =>
    db.withConnection { implicit conn =>
      val data: RoomData = SQL("select * from reserve where id={id}")
        .on("id" -> id)
        .as(roomparser.single)
      Ok(views.html.delete2(
        "該当予約内容です。",
        data, id
      ))
    }
  }

  def remove(id: Int) = Action { implicit request =>
    db.withConnection { implicit conn =>
      val result = SQL("delete from reserve where id = {id}")
        .on("id" -> id)
        .executeUpdate
      Redirect(routes.HomeController.index)
    }
  }
}
