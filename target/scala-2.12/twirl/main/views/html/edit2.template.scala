
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object edit2 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,Form[RoomForm.RoomData],Int,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, form: Form[RoomForm.RoomData], id: Int)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("会議室 予約修正", "-", "Copyright (c)2019 Pug inc.")/*3.53*/ {_display_(Seq[Any](format.raw/*3.55*/("""
    """),format.raw/*4.5*/("""<h:panelGrid columns="1" class="navi">
        <a href=""""),_display_(/*5.19*/routes/*5.25*/.HomeController.index()),format.raw/*5.48*/("""">戻る</a>
        <a href=""""),_display_(/*6.19*/routes/*6.25*/.HomeController.add()),format.raw/*6.46*/("""">予約</a>
        <a href=""""),_display_(/*7.19*/routes/*7.25*/.HomeController.delete()),format.raw/*7.49*/("""">予約削除</a>
    </h:panelGrid>

    <p>"""),_display_(/*10.9*/message),format.raw/*10.16*/(""" """),format.raw/*10.17*/("""修正対象予約番号"""),_display_(/*10.26*/id),format.raw/*10.28*/("""</p>

    """),_display_(/*12.6*/helper/*12.12*/.form(action = routes.HomeController.update(id))/*12.60*/ {_display_(Seq[Any](format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<input type="hidden" name="id" value=""""),_display_(/*13.48*/id),format.raw/*13.50*/("""">
        """),_display_(/*14.10*/helper/*14.16*/.CSRF.formField),format.raw/*14.31*/("""
        """),_display_(/*15.10*/helper/*15.16*/.select(
            field = form("room"),
            args = '_label -> "・予約会議室を修正してください。",
            options = Seq(
                "西館会議室" -> "西館会議室",
                "2階会議室" -> "2階会議室",
                "3階会議室" -> "3階会議室",
                "4階会議室" -> "4階会議室"))),format.raw/*22.37*/("""
        """),_display_(/*23.10*/helper/*23.16*/.inputDate(
            field = form("date"),
            args = '_label -> "・使用月日を修正選択してください。",
        )),format.raw/*26.10*/("""
        """),_display_(/*27.10*/helper/*27.16*/.select(
            field = form("time"),
            args = '_label -> "・使用時間帯を修正選択してください",
            options = Seq(
                "10:00〜11:00" -> "10:00〜11:00",
                "11:00〜12:00" -> "11:00〜12:00",
                "13:00〜14:00" -> "13:00〜14:00",
                "14:00〜15:00" -> "14:00〜15:00"))),format.raw/*34.49*/("""
        """),_display_(/*35.10*/helper/*35.16*/.inputText(
            field = form("name"),
            args = '_label -> "・予約者の名前を修正入力してください")),format.raw/*37.52*/("""
        """),_display_(/*38.10*/helper/*38.16*/.select(
            field = form("sec"),
            args = '_label -> "使用者の所属部門を修正選択してください",
            options = Seq(
                "技術開発部" -> "技術開発部",
                "広報部" -> "広報部",
                "企画営業部" -> "企画営業部",
                "総務部" -> "総務部"))),format.raw/*45.33*/("""
        """),_display_(/*46.10*/helper/*46.16*/.inputRadioGroup(
            field = form("pri"),
            args = '_label -> "・他の部門から調整依頼があった場合の柔軟度を修正選択してください",
            options = Seq(
                "変更可" -> "変更可",
                "変更不可" -> "変更不可"))),format.raw/*51.35*/("""
        """),format.raw/*52.9*/("""<button>修正</button>
    """)))}),format.raw/*53.6*/("""
""")))}),format.raw/*54.2*/("""
"""))
      }
    }
  }

  def render(message:String,form:Form[RoomForm.RoomData],id:Int,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(message,form,id)(request)

  def f:((String,Form[RoomForm.RoomData],Int) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (message,form,id) => (request) => apply(message,form,id)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Aug 02 11:24:08 JST 2022
                  SOURCE: /home/ito/IdeaProjects/play2_scala_会議室予約システム/app/views/edit2.scala.html
                  HASH: e25e9142755de4d46077095398d4978c4b1e79de
                  MATRIX: 779->1|971->100|998->102|1057->153|1096->155|1127->160|1210->217|1224->223|1267->246|1320->273|1334->279|1375->300|1428->327|1442->333|1486->357|1551->396|1579->403|1608->404|1644->413|1667->415|1704->426|1719->432|1776->480|1816->482|1852->491|1918->530|1941->532|1980->544|1995->550|2031->565|2068->575|2083->581|2368->845|2405->855|2420->861|2547->967|2584->977|2599->983|2933->1296|2970->1306|2985->1312|3103->1409|3140->1419|3155->1425|3434->1683|3471->1693|3486->1699|3717->1909|3753->1918|3808->1943|3840->1945
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|29->5|29->5|29->5|30->6|30->6|30->6|31->7|31->7|31->7|34->10|34->10|34->10|34->10|34->10|36->12|36->12|36->12|36->12|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|46->22|47->23|47->23|50->26|51->27|51->27|58->34|59->35|59->35|61->37|62->38|62->38|69->45|70->46|70->46|75->51|76->52|77->53|78->54
                  -- GENERATED --
              */
          