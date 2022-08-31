
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

object delete2 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,RoomForm.RoomData,Int,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, data: RoomForm.RoomData, id: Int)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("会議室 予約削除", "-", "Copyright (c)2019 Pug inc.")/*3.53*/ {_display_(Seq[Any](format.raw/*3.55*/("""
    """),format.raw/*4.5*/("""<h:panelGrid columns="1" class="navi">
        <a href=""""),_display_(/*5.19*/routes/*5.25*/.HomeController.index()),format.raw/*5.48*/("""">戻る</a>
        <a href=""""),_display_(/*6.19*/routes/*6.25*/.HomeController.add()),format.raw/*6.46*/("""">予約</a>
        <a href=""""),_display_(/*7.19*/routes/*7.25*/.HomeController.edit()),format.raw/*7.47*/("""">予約修正</a>
    </h:panelGrid>

    <p>"""),_display_(/*10.9*/message),format.raw/*10.16*/(""" """),format.raw/*10.17*/("""削除修正対象予約番号"""),_display_(/*10.28*/id),format.raw/*10.30*/("""</p>

    <ul>
        <li>予約番号:"""),_display_(/*13.19*/data/*13.23*/.id),format.raw/*13.26*/("""</li>
        <li>会議室名:"""),_display_(/*14.19*/data/*14.23*/.room),format.raw/*14.28*/("""</li>
        <li>月日:"""),_display_(/*15.17*/data/*15.21*/.date),format.raw/*15.26*/("""</li>
        <li>時刻:"""),_display_(/*16.17*/data/*16.21*/.time),format.raw/*16.26*/("""</li>
        <li>予約者名:"""),_display_(/*17.19*/data/*17.23*/.name),format.raw/*17.28*/("""</li>
        <li>使用部門:"""),_display_(/*18.19*/data/*18.23*/.sec),format.raw/*18.27*/("""</li>
        <li>変更柔軟度:"""),_display_(/*19.20*/data/*19.24*/.pri),format.raw/*19.28*/("""</li>
    </ul>
    """),_display_(/*21.6*/helper/*21.12*/.form(action = routes.HomeController.remove(id))/*21.60*/ {_display_(Seq[Any](format.raw/*21.62*/("""
        """),_display_(/*22.10*/helper/*22.16*/.CSRF.formField),format.raw/*22.31*/("""
        """),format.raw/*23.9*/("""<button>削除</button>
    """)))}),format.raw/*24.6*/("""
""")))}))
      }
    }
  }

  def render(message:String,data:RoomForm.RoomData,id:Int,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(message,data,id)(request)

  def f:((String,RoomForm.RoomData,Int) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (message,data,id) => (request) => apply(message,data,id)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Aug 02 11:24:08 JST 2022
                  SOURCE: /home/ito/IdeaProjects/play2_scala_会議室予約システム/app/views/delete2.scala.html
                  HASH: 13129e2b00a810d2396517eafd9ce34c93782e66
                  MATRIX: 775->1|961->94|988->96|1047->147|1086->149|1117->154|1200->211|1214->217|1257->240|1310->267|1324->273|1365->294|1418->321|1432->327|1474->349|1539->388|1567->395|1596->396|1634->407|1657->409|1717->442|1730->446|1754->449|1805->473|1818->477|1844->482|1893->504|1906->508|1932->513|1981->535|1994->539|2020->544|2071->568|2084->572|2110->577|2161->601|2174->605|2199->609|2251->634|2264->638|2289->642|2336->663|2351->669|2408->717|2448->719|2485->729|2500->735|2536->750|2572->759|2627->784
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|29->5|29->5|29->5|30->6|30->6|30->6|31->7|31->7|31->7|34->10|34->10|34->10|34->10|34->10|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|40->16|40->16|40->16|41->17|41->17|41->17|42->18|42->18|42->18|43->19|43->19|43->19|45->21|45->21|45->21|45->21|46->22|46->22|46->22|47->23|48->24
                  -- GENERATED --
              */
          