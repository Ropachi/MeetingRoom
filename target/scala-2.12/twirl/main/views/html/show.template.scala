
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

  /*IDで予約検索・表示*/
  def apply/*3.2*/(message: String, item: RoomForm.RoomData, tid: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("会議室 予約システム", "-", "Copyright (c)2019 Pug inc.")/*5.55*/ {_display_(Seq[Any](format.raw/*5.57*/("""
    """),format.raw/*6.21*/("""
    """),format.raw/*7.5*/("""<h:panelGrid columns="1" class="navi">
        <a href=""""),_display_(/*8.19*/routes/*8.25*/.HomeController.index()),format.raw/*8.48*/("""">戻る</a>
        <a href=""""),_display_(/*9.19*/routes/*9.25*/.HomeController.add()),format.raw/*9.46*/("""">予約</a>
        <a href=""""),_display_(/*10.19*/routes/*10.25*/.HomeController.edit()),format.raw/*10.47*/("""">予約修正</a>
        <a href=""""),_display_(/*11.19*/routes/*11.25*/.HomeController.delete()),format.raw/*11.49*/("""">予約削除</a>
    </h:panelGrid>

    <p>"""),_display_(/*14.9*/Html(message)),format.raw/*14.22*/("""</p>
    <table>
        <tr><th>予約番号</th><th>会議室名</th><th>月日</th><th>時刻</th><th>予約者名</th><th>使用部門</th><th>変更度</th></tr>
        <tr><td>"""),_display_(/*17.18*/item/*17.22*/.id),format.raw/*17.25*/("""</td>
            <td>"""),_display_(/*18.18*/item/*18.22*/.room),format.raw/*18.27*/("""</td>
            <td>"""),_display_(/*19.18*/item/*19.22*/.date),format.raw/*19.27*/("""</td>
            <td>"""),_display_(/*20.18*/item/*20.22*/.time),format.raw/*20.27*/("""</td>
            <td>"""),_display_(/*21.18*/item/*21.22*/.name),format.raw/*21.27*/("""</td>
            <td>"""),_display_(/*22.18*/item/*22.22*/.sec),format.raw/*22.26*/("""</td>
            <td>"""),_display_(/*23.18*/item/*23.22*/.pri),format.raw/*23.26*/("""</td>
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
                  DATE: Thu Sep 01 22:04:12 JST 2022
                  SOURCE: /home/ito/IdeaProjects/play2_scala_会議室予約システム/app/views/show.scala.html
                  HASH: e9a5a0a792effac030f79b35f3f9aa1513e6657c
                  MATRIX: 760->17|906->70|933->72|994->125|1033->127|1065->148|1096->153|1179->210|1193->216|1236->239|1289->266|1303->272|1344->293|1398->320|1413->326|1456->348|1512->377|1527->383|1572->407|1637->446|1671->459|1836->597|1849->601|1873->604|1923->627|1936->631|1962->636|2012->659|2025->663|2051->668|2101->691|2114->695|2140->700|2190->723|2203->727|2229->732|2279->755|2292->759|2317->763|2367->786|2380->790|2405->794
                  LINES: 21->3|26->4|27->5|27->5|27->5|28->6|29->7|30->8|30->8|30->8|31->9|31->9|31->9|32->10|32->10|32->10|33->11|33->11|33->11|36->14|36->14|39->17|39->17|39->17|40->18|40->18|40->18|41->19|41->19|41->19|42->20|42->20|42->20|43->21|43->21|43->21|44->22|44->22|44->22|45->23|45->23|45->23
                  -- GENERATED --
              */
          