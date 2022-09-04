
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

  /*予約データ削除内容の表示*/
  def apply/*2.2*/(message: String, data: RoomForm.RoomData, id: Int)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("会議室 予約削除", "-", "Copyright (c)2019 Pug inc.")/*4.53*/ {_display_(Seq[Any](format.raw/*4.55*/("""
    """),format.raw/*5.21*/("""
    """),format.raw/*6.5*/("""<h:panelGrid columns="1" class="navi">
        <a href=""""),_display_(/*7.19*/routes/*7.25*/.HomeController.index()),format.raw/*7.48*/("""">戻る</a>
        <a href=""""),_display_(/*8.19*/routes/*8.25*/.HomeController.add()),format.raw/*8.46*/("""">予約</a>
        <a href=""""),_display_(/*9.19*/routes/*9.25*/.HomeController.edit()),format.raw/*9.47*/("""">予約修正</a>
    </h:panelGrid>

    <p>"""),_display_(/*12.9*/message),format.raw/*12.16*/(""" """),format.raw/*12.17*/("""削除修正対象予約番号"""),_display_(/*12.28*/id),format.raw/*12.30*/("""</p>

    <ul>
        <li>予約番号:"""),_display_(/*15.19*/data/*15.23*/.id),format.raw/*15.26*/("""</li>
        <li>会議室名:"""),_display_(/*16.19*/data/*16.23*/.room),format.raw/*16.28*/("""</li>
        <li>月日:"""),_display_(/*17.17*/data/*17.21*/.date),format.raw/*17.26*/("""</li>
        <li>時刻:"""),_display_(/*18.17*/data/*18.21*/.time),format.raw/*18.26*/("""</li>
        <li>予約者名:"""),_display_(/*19.19*/data/*19.23*/.name),format.raw/*19.28*/("""</li>
        <li>使用部門:"""),_display_(/*20.19*/data/*20.23*/.sec),format.raw/*20.27*/("""</li>
        <li>変更柔軟度:"""),_display_(/*21.20*/data/*21.24*/.pri),format.raw/*21.28*/("""</li>
    </ul>
    """),_display_(/*23.6*/helper/*23.12*/.form(action = routes.HomeController.remove(id))/*23.60*/ {_display_(Seq[Any](format.raw/*23.62*/("""
        """),_display_(/*24.10*/helper/*24.16*/.CSRF.formField),format.raw/*24.31*/("""
        """),format.raw/*25.9*/("""<button>削除</button>
    """)))}),format.raw/*26.6*/("""
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
                  DATE: Thu Sep 01 22:04:12 JST 2022
                  SOURCE: /home/ito/IdeaProjects/play2_scala_会議室予約システム/app/views/delete2.scala.html
                  HASH: a87b48631363fed6fd1c1e7b004328aa6dc5df70
                  MATRIX: 787->18|973->111|1000->113|1059->164|1098->166|1130->187|1161->192|1244->249|1258->255|1301->278|1354->305|1368->311|1409->332|1462->359|1476->365|1518->387|1583->426|1611->433|1640->434|1678->445|1701->447|1761->480|1774->484|1798->487|1849->511|1862->515|1888->520|1937->542|1950->546|1976->551|2025->573|2038->577|2064->582|2115->606|2128->610|2154->615|2205->639|2218->643|2243->647|2295->672|2308->676|2333->680|2380->701|2395->707|2452->755|2492->757|2529->767|2544->773|2580->788|2616->797|2671->822
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|29->6|30->7|30->7|30->7|31->8|31->8|31->8|32->9|32->9|32->9|35->12|35->12|35->12|35->12|35->12|38->15|38->15|38->15|39->16|39->16|39->16|40->17|40->17|40->17|41->18|41->18|41->18|42->19|42->19|42->19|43->20|43->20|43->20|44->21|44->21|44->21|46->23|46->23|46->23|46->23|47->24|47->24|47->24|48->25|49->26
                  -- GENERATED --
              */
          