
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

object show extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,RoomForm.RoomData,Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, item: RoomForm.RoomData, tid: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("会議室 予約システム", "-", "Copyright (c)2019 Pug inc.")/*3.55*/ {_display_(Seq[Any](format.raw/*3.57*/("""

    """),format.raw/*5.5*/("""<h:panelGrid columns="1" class="navi">
        <a href=""""),_display_(/*6.19*/routes/*6.25*/.HomeController.index()),format.raw/*6.48*/("""">戻る</a>
        <a href=""""),_display_(/*7.19*/routes/*7.25*/.HomeController.add()),format.raw/*7.46*/("""">予約</a>
        <a href=""""),_display_(/*8.19*/routes/*8.25*/.HomeController.edit()),format.raw/*8.47*/("""">予約修正</a>
        <a href=""""),_display_(/*9.19*/routes/*9.25*/.HomeController.delete()),format.raw/*9.49*/("""">予約削除</a>
    </h:panelGrid>

    <p>"""),_display_(/*12.9*/Html(message)),format.raw/*12.22*/("""</p>
    <table>
        <tr><th>予約番号</th><th>会議室名</th><th>月日</th><th>時刻</th><th>予約者名</th><th>使用部門</th><th>変更度</th></tr>
        <tr><td>"""),_display_(/*15.18*/item/*15.22*/.id),format.raw/*15.25*/("""</td>
            <td>"""),_display_(/*16.18*/item/*16.22*/.room),format.raw/*16.27*/("""</td>
            <td>"""),_display_(/*17.18*/item/*17.22*/.date),format.raw/*17.27*/("""</td>
            <td>"""),_display_(/*18.18*/item/*18.22*/.time),format.raw/*18.27*/("""</td>
            <td>"""),_display_(/*19.18*/item/*19.22*/.name),format.raw/*19.27*/("""</td>
            <td>"""),_display_(/*20.18*/item/*20.22*/.sec),format.raw/*20.26*/("""</td>
            <td>"""),_display_(/*21.18*/item/*21.22*/.pri),format.raw/*21.26*/("""</td>
        </tr>
    </table>
    <br>
    <br>
""")))}))
      }
    }
  }

  def render(message:String,item:RoomForm.RoomData,tid:Int): play.twirl.api.HtmlFormat.Appendable = apply(message,item,tid)

  def f:((String,RoomForm.RoomData,Int) => play.twirl.api.HtmlFormat.Appendable) = (message,item,tid) => apply(message,item,tid)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Aug 02 11:24:08 JST 2022
                  SOURCE: /home/ito/IdeaProjects/play2_scala_会議室予約システム/app/views/show.scala.html
                  HASH: 56f48fa2e313a80fed9ab999696662128c758021
                  MATRIX: 750->1|896->54|923->56|984->109|1023->111|1055->117|1138->174|1152->180|1195->203|1248->230|1262->236|1303->257|1356->284|1370->290|1412->312|1467->341|1481->347|1525->371|1590->410|1624->423|1789->561|1802->565|1826->568|1876->591|1889->595|1915->600|1965->623|1978->627|2004->632|2054->655|2067->659|2093->664|2143->687|2156->691|2182->696|2232->719|2245->723|2270->727|2320->750|2333->754|2358->758
                  LINES: 21->1|26->2|27->3|27->3|27->3|29->5|30->6|30->6|30->6|31->7|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|36->12|36->12|39->15|39->15|39->15|40->16|40->16|40->16|41->17|41->17|41->17|42->18|42->18|42->18|43->19|43->19|43->19|44->20|44->20|44->20|45->21|45->21|45->21
                  -- GENERATED --
              */
          