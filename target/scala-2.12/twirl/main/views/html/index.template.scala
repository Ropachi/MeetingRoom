
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,List[RoomForm.RoomData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, result: List[RoomForm.RoomData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("会議室 予約システム", "-", "Copyright (c)2019 Pug inc.")/*3.55*/ {_display_(Seq[Any](format.raw/*3.57*/("""
    """),format.raw/*4.5*/("""<h:panelGrid columns="1" class="navi">
        <a href=""""),_display_(/*5.19*/routes/*5.25*/.HomeController.add()),format.raw/*5.46*/("""">予約</a>
        <a href=""""),_display_(/*6.19*/routes/*6.25*/.HomeController.edit()),format.raw/*6.47*/("""">予約修正</a>
        <a href=""""),_display_(/*7.19*/routes/*7.25*/.HomeController.delete()),format.raw/*7.49*/("""">予約削除</a>
    </h:panelGrid>

    <p>"""),_display_(/*10.9*/Html(message)),format.raw/*10.22*/("""</p>
    <table>
        <tr><th>予約番号</th><th>会議室名</th><th>月日</th><th>時刻</th><th>予約者名</th><th>使用部門</th><th>変更度</th></tr>
        """),_display_(/*13.10*/for(item <- result) yield /*13.29*/ {_display_(Seq[Any](format.raw/*13.31*/("""
            """),format.raw/*14.13*/("""<tr><td>"""),_display_(/*14.22*/item/*14.26*/.id),format.raw/*14.29*/("""</td>
                <td>"""),_display_(/*15.22*/item/*15.26*/.room),format.raw/*15.31*/("""</td>
                <td>"""),_display_(/*16.22*/item/*16.26*/.date),format.raw/*16.31*/("""</td>
                <td>"""),_display_(/*17.22*/item/*17.26*/.time),format.raw/*17.31*/("""</td>
                <td>"""),_display_(/*18.22*/item/*18.26*/.name),format.raw/*18.31*/("""</td>
                <td>"""),_display_(/*19.22*/item/*19.26*/.sec),format.raw/*19.30*/("""</td>
                <td>"""),_display_(/*20.22*/item/*20.26*/.pri),format.raw/*20.30*/("""</td>
            </tr>
        """)))}),format.raw/*22.10*/("""
    """),format.raw/*23.5*/("""</table>
    <br>
    <br>
""")))}))
      }
    }
  }

  def render(message:String,result:List[RoomForm.RoomData]): play.twirl.api.HtmlFormat.Appendable = apply(message,result)

  def f:((String,List[RoomForm.RoomData]) => play.twirl.api.HtmlFormat.Appendable) = (message,result) => apply(message,result)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Aug 02 11:24:08 JST 2022
                  SOURCE: /home/ito/IdeaProjects/play2_scala_会議室予約システム/app/views/index.scala.html
                  HASH: 36121769c1366dba5f98b42ed346a41a16f00984
                  MATRIX: 753->1|897->52|924->54|985->107|1024->109|1055->114|1138->171|1152->177|1193->198|1246->225|1260->231|1302->253|1357->282|1371->288|1415->312|1480->351|1514->364|1671->494|1706->513|1746->515|1787->528|1823->537|1836->541|1860->544|1914->571|1927->575|1953->580|2007->607|2020->611|2046->616|2100->643|2113->647|2139->652|2193->679|2206->683|2232->688|2286->715|2299->719|2324->723|2378->750|2391->754|2416->758|2480->791|2512->796
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|29->5|29->5|29->5|30->6|30->6|30->6|31->7|31->7|31->7|34->10|34->10|37->13|37->13|37->13|38->14|38->14|38->14|38->14|39->15|39->15|39->15|40->16|40->16|40->16|41->17|41->17|41->17|42->18|42->18|42->18|43->19|43->19|43->19|44->20|44->20|44->20|46->22|47->23
                  -- GENERATED --
              */
          