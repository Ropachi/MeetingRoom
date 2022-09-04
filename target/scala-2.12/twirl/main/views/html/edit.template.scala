
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

  /*修正頁呼ぶ前に予約番号を入力してもらうための頁*/
  def apply/*2.2*/(message: String, form: Form[RoomForm.Data])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
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

    <p id="error">"""),_display_(/*12.20*/message),format.raw/*12.27*/("""　</p>
    """),_display_(/*13.6*/helper/*13.12*/.form(action = routes.HomeController.editB())/*13.57*/ {_display_(Seq[Any](format.raw/*13.59*/("""
        """),_display_(/*14.10*/helper/*14.16*/.inputText(
            field = form("id"),
            args = '_label -> "・修正対象の予約番号を入力してください")),format.raw/*16.53*/("""
        """),_display_(/*17.10*/helper/*17.16*/.CSRF.formField),format.raw/*17.31*/("""
        """),format.raw/*18.9*/("""<br>
        <button>OK</button>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
    """)))}),format.raw/*26.6*/("""
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
                  SOURCE: /home/ito/IdeaProjects/play2_scala_会議室予約システム/app/views/edit.scala.html
                  HASH: 1cab23a38059cac019e330258c0f3667a85efd0f
                  MATRIX: 793->29|972->115|999->117|1058->168|1097->170|1129->191|1160->196|1243->253|1257->259|1300->282|1353->309|1367->315|1408->336|1461->363|1475->369|1519->393|1596->443|1624->450|1661->461|1676->467|1730->512|1770->514|1807->524|1822->530|1939->626|1976->636|1991->642|2027->657|2063->666|2209->782
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|29->6|30->7|30->7|30->7|31->8|31->8|31->8|32->9|32->9|32->9|35->12|35->12|36->13|36->13|36->13|36->13|37->14|37->14|39->16|40->17|40->17|40->17|41->18|49->26
                  -- GENERATED --
              */
          