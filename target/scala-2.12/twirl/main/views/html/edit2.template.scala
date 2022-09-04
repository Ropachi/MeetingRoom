
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

  /*会議室 予約修正更新*/
  def apply/*2.2*/(message: String, form: Form[RoomForm.RoomData], id: Int)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("会議室 予約修正", "-", "Copyright (c)2019 Pug inc.")/*4.53*/ {_display_(Seq[Any](format.raw/*4.55*/("""
    """),format.raw/*5.21*/("""
    """),format.raw/*6.5*/("""<h:panelGrid columns="1" class="navi">
        <a href=""""),_display_(/*7.19*/routes/*7.25*/.HomeController.index()),format.raw/*7.48*/("""">戻る</a>
        <a href=""""),_display_(/*8.19*/routes/*8.25*/.HomeController.add()),format.raw/*8.46*/("""">予約</a>
        <a href=""""),_display_(/*9.19*/routes/*9.25*/.HomeController.delete()),format.raw/*9.49*/("""">予約削除</a>
    </h:panelGrid>

    <p>"""),_display_(/*12.9*/message),format.raw/*12.16*/(""" """),format.raw/*12.17*/("""修正対象予約番号"""),_display_(/*12.26*/id),format.raw/*12.28*/("""</p>

    """),_display_(/*14.6*/helper/*14.12*/.form(action = routes.HomeController.update(id))/*14.60*/ {_display_(Seq[Any](format.raw/*14.62*/("""
        """),format.raw/*15.9*/("""<input type="hidden" name="id" value=""""),_display_(/*15.48*/id),format.raw/*15.50*/("""">
        """),_display_(/*16.10*/helper/*16.16*/.CSRF.formField),format.raw/*16.31*/("""
        """),_display_(/*17.10*/helper/*17.16*/.select(
            field = form("room"),
            args = '_label -> "・予約会議室を修正してください。",
            options = Seq(
                "西館会議室" -> "西館会議室",
                "2階会議室" -> "2階会議室",
                "3階会議室" -> "3階会議室",
                "4階会議室" -> "4階会議室"))),format.raw/*24.37*/("""
        """),_display_(/*25.10*/helper/*25.16*/.inputDate(
            field = form("date"),
            args = '_label -> "・使用月日を修正選択してください。",
        )),format.raw/*28.10*/("""
        """),_display_(/*29.10*/helper/*29.16*/.select(
            field = form("time"),
            args = '_label -> "・使用時間帯を修正選択してください",
            options = Seq(
                "10:00〜11:00" -> "10:00〜11:00",
                "11:00〜12:00" -> "11:00〜12:00",
                "13:00〜14:00" -> "13:00〜14:00",
                "14:00〜15:00" -> "14:00〜15:00"))),format.raw/*36.49*/("""
        """),_display_(/*37.10*/helper/*37.16*/.inputText(
            field = form("name"),
            args = '_label -> "・予約者の名前を修正入力してください")),format.raw/*39.52*/("""
        """),_display_(/*40.10*/helper/*40.16*/.select(
            field = form("sec"),
            args = '_label -> "使用者の所属部門を修正選択してください",
            options = Seq(
                "技術開発部" -> "技術開発部",
                "広報部" -> "広報部",
                "企画営業部" -> "企画営業部",
                "総務部" -> "総務部"))),format.raw/*47.33*/("""
        """),_display_(/*48.10*/helper/*48.16*/.inputRadioGroup(
            field = form("pri"),
            args = '_label -> "・他の部門から調整依頼があった場合の柔軟度を修正選択してください",
            options = Seq(
                "変更可" -> "変更可",
                "変更不可" -> "変更不可"))),format.raw/*53.35*/("""
        """),format.raw/*54.9*/("""<button>修正</button>
    """)))}),format.raw/*55.6*/("""
""")))}),format.raw/*56.2*/("""
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
                  DATE: Thu Sep 01 22:04:12 JST 2022
                  SOURCE: /home/ito/IdeaProjects/play2_scala_会議室予約システム/app/views/edit2.scala.html
                  HASH: c4bc9f608b5eb78d6996d7cabafd7d34eb4a53c4
                  MATRIX: 789->16|981->115|1008->117|1067->168|1106->170|1138->191|1169->196|1252->253|1266->259|1309->282|1362->309|1376->315|1417->336|1470->363|1484->369|1528->393|1593->432|1621->439|1650->440|1686->449|1709->451|1746->462|1761->468|1818->516|1858->518|1894->527|1960->566|1983->568|2022->580|2037->586|2073->601|2110->611|2125->617|2410->881|2447->891|2462->897|2589->1003|2626->1013|2641->1019|2975->1332|3012->1342|3027->1348|3145->1445|3182->1455|3197->1461|3476->1719|3513->1729|3528->1735|3759->1945|3795->1954|3850->1979|3882->1981
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|29->6|30->7|30->7|30->7|31->8|31->8|31->8|32->9|32->9|32->9|35->12|35->12|35->12|35->12|35->12|37->14|37->14|37->14|37->14|38->15|38->15|38->15|39->16|39->16|39->16|40->17|40->17|47->24|48->25|48->25|51->28|52->29|52->29|59->36|60->37|60->37|62->39|63->40|63->40|70->47|71->48|71->48|76->53|77->54|78->55|79->56
                  -- GENERATED --
              */
          