
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

object delete extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Form[RoomForm.Data],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, form: Form[RoomForm.Data])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("会議室 予約削除", "-", "Copyright (c)2019 Pug inc.")/*3.53*/ {_display_(Seq[Any](format.raw/*3.55*/("""
    """),format.raw/*4.5*/("""<h:panelGrid columns="1" class="navi">
        <a href=""""),_display_(/*5.19*/routes/*5.25*/.HomeController.index()),format.raw/*5.48*/("""">戻る</a>
        <a href=""""),_display_(/*6.19*/routes/*6.25*/.HomeController.add()),format.raw/*6.46*/("""">予約</a>
        <a href=""""),_display_(/*7.19*/routes/*7.25*/.HomeController.edit()),format.raw/*7.47*/("""">予約修正</a>
    </h:panelGrid>

    <p id="error">"""),_display_(/*10.20*/message),format.raw/*10.27*/("""　</p>
    """),_display_(/*11.6*/helper/*11.12*/.form(action = routes.HomeController.deleteB())/*11.59*/ {_display_(Seq[Any](format.raw/*11.61*/("""
        """),_display_(/*12.10*/helper/*12.16*/.inputText(
            field = form("id"),
            args = '_label -> "・削除対象の予約番号を入力してください")),format.raw/*14.53*/("""
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
                  SOURCE: /home/ito/IdeaProjects/play2_scala_会議室予約システム/app/views/delete.scala.html
                  HASH: a41be25d74f96403ae7c9aa1b54b6b567a16cc8e
                  MATRIX: 772->1|951->87|978->89|1037->140|1076->142|1107->147|1190->204|1204->210|1247->233|1300->260|1314->266|1355->287|1408->314|1422->320|1464->342|1541->392|1569->399|1606->410|1621->416|1677->463|1717->465|1754->475|1769->481|1886->577|1923->587|1938->593|1974->608|2010->617|2156->733
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|29->5|29->5|29->5|30->6|30->6|30->6|31->7|31->7|31->7|34->10|34->10|35->11|35->11|35->11|35->11|36->12|36->12|38->14|39->15|39->15|39->15|40->16|48->24
                  -- GENERATED --
              */
          