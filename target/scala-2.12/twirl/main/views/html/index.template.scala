
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

  /*全予約リスト一覧取得・表示*/
  def apply/*3.2*/(message: String, result: List[RoomForm.RoomData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("会議室 予約システム", "-", "Copyright (c)2019 Pug inc.")/*5.55*/ {_display_(Seq[Any](format.raw/*5.57*/("""
    """),format.raw/*6.21*/("""
    """),format.raw/*7.5*/("""<h:panelGrid columns="1" class="navi">
        <a href=""""),_display_(/*8.19*/routes/*8.25*/.HomeController.add()),format.raw/*8.46*/("""">予約</a>
        <a href=""""),_display_(/*9.19*/routes/*9.25*/.HomeController.edit()),format.raw/*9.47*/("""">予約修正</a>
        <a href=""""),_display_(/*10.19*/routes/*10.25*/.HomeController.delete()),format.raw/*10.49*/("""">予約削除</a>
    </h:panelGrid>

    <p>"""),_display_(/*13.9*/Html(message)),format.raw/*13.22*/("""</p>
    <table>
        <tr><th>予約番号</th><th>会議室名</th><th>月日</th><th>時刻</th><th>予約者名</th><th>使用部門</th><th>変更度</th></tr>
        """),_display_(/*16.10*/for(item <- result) yield /*16.29*/ {_display_(Seq[Any](format.raw/*16.31*/("""
            """),format.raw/*17.13*/("""<tr><td>"""),_display_(/*17.22*/item/*17.26*/.id),format.raw/*17.29*/("""</td>
                <td>"""),_display_(/*18.22*/item/*18.26*/.room),format.raw/*18.31*/("""</td>
                <td>"""),_display_(/*19.22*/item/*19.26*/.date),format.raw/*19.31*/("""</td>
                <td>"""),_display_(/*20.22*/item/*20.26*/.time),format.raw/*20.31*/("""</td>
                <td>"""),_display_(/*21.22*/item/*21.26*/.name),format.raw/*21.31*/("""</td>
                <td>"""),_display_(/*22.22*/item/*22.26*/.sec),format.raw/*22.30*/("""</td>
                <td>"""),_display_(/*23.22*/item/*23.26*/.pri),format.raw/*23.30*/("""</td>
            </tr>
        """)))}),format.raw/*25.10*/("""
    """),format.raw/*26.5*/("""</table>
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
                  DATE: Thu Sep 01 22:04:12 JST 2022
                  SOURCE: /home/ito/IdeaProjects/play2_scala_会議室予約システム/app/views/index.scala.html
                  HASH: a8cb96f5979e19ceda5b5c777ce3015446c6d50b
                  MATRIX: 766->20|910->71|937->73|998->126|1037->128|1069->149|1100->154|1183->211|1197->217|1238->238|1291->265|1305->271|1347->293|1403->322|1418->328|1463->352|1528->391|1562->404|1719->534|1754->553|1794->555|1835->568|1871->577|1884->581|1908->584|1962->611|1975->615|2001->620|2055->647|2068->651|2094->656|2148->683|2161->687|2187->692|2241->719|2254->723|2280->728|2334->755|2347->759|2372->763|2426->790|2439->794|2464->798|2528->831|2560->836
                  LINES: 21->3|26->4|27->5|27->5|27->5|28->6|29->7|30->8|30->8|30->8|31->9|31->9|31->9|32->10|32->10|32->10|35->13|35->13|38->16|38->16|38->16|39->17|39->17|39->17|39->17|40->18|40->18|40->18|41->19|41->19|41->19|42->20|42->20|42->20|43->21|43->21|43->21|44->22|44->22|44->22|45->23|45->23|45->23|47->25|48->26
                  -- GENERATED --
              */
          