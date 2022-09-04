
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

  /*会議室予約*/
  def apply/*2.2*/(message: String, form: Form[RoomForm.Data])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("会議室 予約", "-", "Copyright (c)2019 Pug inc.")/*4.51*/ {_display_(Seq[Any](format.raw/*4.53*/("""
    """),format.raw/*5.21*/("""
    """),format.raw/*6.5*/("""<h:panelGrid columns="1" class="navi">
        <a href=""""),_display_(/*7.19*/routes/*7.25*/.HomeController.index()),format.raw/*7.48*/("""">戻る</a>
        <a href=""""),_display_(/*8.19*/routes/*8.25*/.HomeController.edit()),format.raw/*8.47*/("""">予約修正</a>
        <a href=""""),_display_(/*9.19*/routes/*9.25*/.HomeController.delete()),format.raw/*9.49*/("""">予約削除</a>
    </h:panelGrid>

    <p id="error">"""),_display_(/*12.20*/message),format.raw/*12.27*/("""　</p>
    """),_display_(/*13.6*/helper/*13.12*/.form(action = routes.HomeController.create())/*13.58*/ {_display_(Seq[Any](format.raw/*13.60*/("""
        """),_display_(/*14.10*/helper/*14.16*/.CSRF.formField),format.raw/*14.31*/("""
        """),_display_(/*15.10*/helper/*15.16*/.select(
            field = form("room"),
            args = '_label -> "・予約する会議室を選択してください。",
            options = Seq(
                "西館会議室" -> "西館会議室",
                "2階会議室" -> "2階会議室",
                "3階会議室" -> "3階会議室",
                "4階会議室" -> "4階会議室"))),format.raw/*22.37*/("""
        """),_display_(/*23.10*/helper/*23.16*/.inputDate(
            field = form("date"),
            args = '_label -> "・使用月日を選択してください。",
        )),format.raw/*26.10*/("""
        """),_display_(/*27.10*/helper/*27.16*/.select(
            field = form("time"),
            args = '_label -> "・使用時間帯を選択してください",
            options = Seq(
                "10:00〜11:00" -> "10:00〜11:00",
                "11:00〜12:00" -> "11:00〜12:00",
                "13:00〜14:00" -> "13:00〜14:00",
                "14:00〜15:00" -> "14:00〜15:00"))),format.raw/*34.49*/("""
        """),_display_(/*35.10*/helper/*35.16*/.inputText(
            field = form("name"),
            args = '_label -> "・予約者の名前を入力してください")),format.raw/*37.50*/("""
        """),_display_(/*38.10*/helper/*38.16*/.select(
            field = form("sec"),
            args = '_label -> "・使用者の所属部門を選択してください",
            options = Seq(
                "技術開発部" -> "技術開発部",
                "広報部" -> "広報部",
                "企画営業部" -> "企画営業部",
                "総務部" -> "総務部"))),format.raw/*45.33*/("""
        """),_display_(/*46.10*/helper/*46.16*/.inputRadioGroup(
            field = form("pri"),
            args = '_label -> "・他の部門から調整依頼があった場合の柔軟度を選択してください",
            options = Seq(
                "変更可" -> "変更可",
                "変更不可" -> "変更不可"))),format.raw/*51.35*/("""

        """),format.raw/*53.9*/("""<button>予約</button>
        <br>
    """)))}),format.raw/*55.6*/("""
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
                  DATE: Thu Sep 01 22:04:12 JST 2022
                  SOURCE: /home/ito/IdeaProjects/play2_scala_会議室予約システム/app/views/add.scala.html
                  HASH: cc0f982268060d4724c5b1e9dc59dd0d7d10ea71
                  MATRIX: 774->11|953->97|980->99|1037->148|1076->150|1108->171|1139->176|1222->233|1236->239|1279->262|1332->289|1346->295|1388->317|1443->346|1457->352|1501->376|1578->426|1606->433|1643->444|1658->450|1713->496|1753->498|1790->508|1805->514|1841->529|1878->539|1893->545|2180->811|2217->821|2232->827|2357->931|2394->941|2409->947|2741->1258|2778->1268|2793->1274|2909->1369|2946->1379|2961->1385|3239->1642|3276->1652|3291->1658|3520->1866|3557->1876|3625->1914
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|29->6|30->7|30->7|30->7|31->8|31->8|31->8|32->9|32->9|32->9|35->12|35->12|36->13|36->13|36->13|36->13|37->14|37->14|37->14|38->15|38->15|45->22|46->23|46->23|49->26|50->27|50->27|57->34|58->35|58->35|60->37|61->38|61->38|68->45|69->46|69->46|74->51|76->53|78->55
                  -- GENERATED --
              */
          