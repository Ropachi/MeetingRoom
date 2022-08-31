
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

object add extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Form[RoomForm.Data],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, form: Form[RoomForm.Data])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("会議室 予約", "-", "Copyright (c)2019 Pug inc.")/*3.51*/ {_display_(Seq[Any](format.raw/*3.53*/("""

    """),format.raw/*5.5*/("""<h:panelGrid columns="1" class="navi">
        <a href=""""),_display_(/*6.19*/routes/*6.25*/.HomeController.index()),format.raw/*6.48*/("""">戻る</a>
        <a href=""""),_display_(/*7.19*/routes/*7.25*/.HomeController.edit()),format.raw/*7.47*/("""">予約修正</a>
        <a href=""""),_display_(/*8.19*/routes/*8.25*/.HomeController.delete()),format.raw/*8.49*/("""">予約削除</a>
    </h:panelGrid>

    <p id="error">"""),_display_(/*11.20*/message),format.raw/*11.27*/("""　</p>
    """),_display_(/*12.6*/helper/*12.12*/.form(action = routes.HomeController.create())/*12.58*/ {_display_(Seq[Any](format.raw/*12.60*/("""
        """),_display_(/*13.10*/helper/*13.16*/.CSRF.formField),format.raw/*13.31*/("""
        """),_display_(/*14.10*/helper/*14.16*/.select(
            field = form("room"),
            args = '_label -> "・予約する会議室を選択してください。",
            options = Seq(
                "西館会議室" -> "西館会議室",
                "2階会議室" -> "2階会議室",
                "3階会議室" -> "3階会議室",
                "4階会議室" -> "4階会議室"))),format.raw/*21.37*/("""
        """),_display_(/*22.10*/helper/*22.16*/.inputDate(
            field = form("date"),
            args = '_label -> "・使用月日を選択してください。",
        )),format.raw/*25.10*/("""
        """),_display_(/*26.10*/helper/*26.16*/.select(
            field = form("time"),
            args = '_label -> "・使用時間帯を選択してください",
            options = Seq(
                "10:00〜11:00" -> "10:00〜11:00",
                "11:00〜12:00" -> "11:00〜12:00",
                "13:00〜14:00" -> "13:00〜14:00",
                "14:00〜15:00" -> "14:00〜15:00"))),format.raw/*33.49*/("""
        """),_display_(/*34.10*/helper/*34.16*/.inputText(
            field = form("name"),
            args = '_label -> "・予約者の名前を入力してください")),format.raw/*36.50*/("""
        """),_display_(/*37.10*/helper/*37.16*/.select(
            field = form("sec"),
            args = '_label -> "・使用者の所属部門を選択してください",
            options = Seq(
                "技術開発部" -> "技術開発部",
                "広報部" -> "広報部",
                "企画営業部" -> "企画営業部",
                "総務部" -> "総務部"))),format.raw/*44.33*/("""
        """),_display_(/*45.10*/helper/*45.16*/.inputRadioGroup(
            field = form("pri"),
            args = '_label -> "・他の部門から調整依頼があった場合の柔軟度を選択してください",
            options = Seq(
                "変更可" -> "変更可",
                "変更不可" -> "変更不可"))),format.raw/*50.35*/("""

        """),format.raw/*52.9*/("""<button>予約</button>
        <br>
    """)))}),format.raw/*54.6*/("""
""")))}))
      }
    }
  }

  def render(message:String,form:Form[RoomForm.Data],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(message,form)(request)

  def f:((String,Form[RoomForm.Data]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (message,form) => (request) => apply(message,form)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Aug 02 11:24:08 JST 2022
                  SOURCE: /home/ito/IdeaProjects/play2_scala_会議室予約システム/app/views/add.scala.html
                  HASH: f281d41e5bf2bf7e2fb5c991538a57b0de43e6f6
                  MATRIX: 769->1|948->87|975->89|1032->138|1071->140|1103->146|1186->203|1200->209|1243->232|1296->259|1310->265|1352->287|1407->316|1421->322|1465->346|1542->396|1570->403|1607->414|1622->420|1677->466|1717->468|1754->478|1769->484|1805->499|1842->509|1857->515|2144->781|2181->791|2196->797|2321->901|2358->911|2373->917|2705->1228|2742->1238|2757->1244|2873->1339|2910->1349|2925->1355|3203->1612|3240->1622|3255->1628|3484->1836|3521->1846|3589->1884
                  LINES: 21->1|26->2|27->3|27->3|27->3|29->5|30->6|30->6|30->6|31->7|31->7|31->7|32->8|32->8|32->8|35->11|35->11|36->12|36->12|36->12|36->12|37->13|37->13|37->13|38->14|38->14|45->21|46->22|46->22|49->25|50->26|50->26|57->33|58->34|58->34|60->36|61->37|61->37|68->44|69->45|69->45|74->50|76->52|78->54
                  -- GENERATED --
              */
          