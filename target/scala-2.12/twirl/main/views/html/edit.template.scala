
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

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Form[RoomForm.Data],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, form: Form[RoomForm.Data])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("会議室 予約修正", "-", "Copyright (c)2019 Pug inc.")/*3.53*/ {_display_(Seq[Any](format.raw/*3.55*/("""
    """),format.raw/*4.5*/("""<h:panelGrid columns="1" class="navi">
        <a href=""""),_display_(/*5.19*/routes/*5.25*/.HomeController.index()),format.raw/*5.48*/("""">戻る</a>
        <a href=""""),_display_(/*6.19*/routes/*6.25*/.HomeController.add()),format.raw/*6.46*/("""">予約</a>
        <a href=""""),_display_(/*7.19*/routes/*7.25*/.HomeController.delete()),format.raw/*7.49*/("""">予約削除</a>
    </h:panelGrid>

    <p id="error">"""),_display_(/*10.20*/message),format.raw/*10.27*/("""　</p>
    """),_display_(/*11.6*/helper/*11.12*/.form(action = routes.HomeController.editB())/*11.57*/ {_display_(Seq[Any](format.raw/*11.59*/("""
        """),_display_(/*12.10*/helper/*12.16*/.inputText(
            field = form("id"),
            args = '_label -> "・修正対象の予約番号を入力してください")),format.raw/*14.53*/("""
        """),_display_(/*15.10*/helper/*15.16*/.CSRF.formField),format.raw/*15.31*/("""
        """),format.raw/*16.9*/("""<br>
        <button>OK</button>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
    """)))}),format.raw/*24.6*/("""
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
                  SOURCE: /home/ito/IdeaProjects/play2_scala_会議室予約システム/app/views/edit.scala.html
                  HASH: e146a446734a0f9f4202743661680ad610725600
                  MATRIX: 770->1|949->87|976->89|1035->140|1074->142|1105->147|1188->204|1202->210|1245->233|1298->260|1312->266|1353->287|1406->314|1420->320|1464->344|1541->394|1569->401|1606->412|1621->418|1675->463|1715->465|1752->475|1767->481|1884->577|1921->587|1936->593|1972->608|2008->617|2154->733
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|29->5|29->5|29->5|30->6|30->6|30->6|31->7|31->7|31->7|34->10|34->10|35->11|35->11|35->11|35->11|36->12|36->12|38->14|39->15|39->15|39->15|40->16|48->24
                  -- GENERATED --
              */
          