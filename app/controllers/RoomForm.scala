//データベースモデル設定
package controllers

import anorm._
import play.api.data.Forms._
import play.api.data._
import play.api.db._


object RoomForm {

  //データベース スキーマ設定
  case class Data(room: String, date: String, time: String, name: String, sec: String, pri: String)

  case class RoomData(id: Int, room: String, date: String, time: String, name: String, sec: String, pri: String)

  val form = Form(
    mapping(
      "room" -> nonEmptyText
        .verifying(error = " 会議室が選択されていませんでした。",
          constraint = _.length >= 1),

      "date" -> nonEmptyText
        .verifying(error = "日付が選択されていませんでした。",
          constraint = _.length >= 4),

      "time" -> nonEmptyText
        .verifying(error = " 時間帯が選択されていませんでした。",
          constraint = _.length >= 1),

      "name" -> nonEmptyText
        .verifying(error = "3文字以上に。",
          constraint = _.length >= 3),

      "sec" -> nonEmptyText
        .verifying(error = "所属部門が選択されていませんでした。",
          constraint = _.length >= 1),

      "pri" -> nonEmptyText
        .verifying(error = "優先度が選択されていませんでした。",
          constraint = _.length >= 1),

    )(Data.apply)(Data.unapply)
  )

  val roomform = Form(
    mapping(
      "id" -> number,
      "room" -> text,
      "date" -> nonEmptyText
        .verifying(error = "日付が選択されていませんでした。",
          constraint = _.length >= 4),

      "time" -> nonEmptyText
        .verifying(error = " 時間帯が選択されていませんでした。",
          constraint = _.length >= 1),

      "name" -> text,
      "sec" -> text,
      "pri" -> text
    )(RoomData.apply)(RoomData.unapply)
  )
    //SQLパーサーを設定(HomeControllerにてsqlで使う。)
  val roomparser = {
    SqlParser.int("reserve.id") ~
      SqlParser.str("reserve.room") ~
      SqlParser.str("reserve.date") ~
      SqlParser.str("reserve.time") ~
      SqlParser.str("reserve.name") ~
      SqlParser.str("reserve.sec") ~
      SqlParser.str("reserve.pri")
  } map {
    case id ~ room ~ date ~ time ~ name ~ sec ~ pri =>
      RoomData(id, room, date, time, name, sec, pri)
  }
}
