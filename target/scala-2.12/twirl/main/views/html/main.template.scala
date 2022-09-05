
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, header: String, footer: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.23*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen"
        href=""""),_display_(/*9.16*/routes/*9.22*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.63*/("""">
    </head>
    <body>
        <header class="row">
            <div class="header">"""),_display_(/*13.34*/header),format.raw/*13.40*/("""</div>
            <img src=""""),_display_(/*14.24*/routes/*14.30*/.Assets.versioned("images/meetingroom.jpg")),format.raw/*14.73*/("""">
            <h1>"""),_display_(/*15.18*/title),format.raw/*15.23*/("""</h1>
        </header>
        <article class="row">
        """),_display_(/*18.10*/content),format.raw/*18.17*/("""
        """),format.raw/*19.9*/("""</article>
        <footer class="row">
            <p>"""),_display_(/*21.17*/footer),format.raw/*21.23*/("""</p>
        </footer>
        <script src=""""),_display_(/*23.23*/routes/*23.29*/.Assets.versioned("javascripts/main.js")),format.raw/*23.69*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,header:String,footer:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,header,footer)(content)

  def f:((String,String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,header,footer) => (content) => apply(title,header,footer)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 05 13:43:35 JST 2022
                  SOURCE: /home/ito/IdeaProjects/play2_scala_会議室予約システム/app/views/main.scala.html
                  HASH: e14e16b0a3e23ffd694dfcdcf4eaaa964e7c7964
                  MATRIX: 747->1|903->64|931->87|958->88|1044->148|1069->153|1165->223|1179->229|1240->270|1355->358|1382->364|1439->394|1454->400|1518->443|1565->463|1591->468|1681->531|1709->538|1745->547|1828->603|1855->609|1927->654|1942->660|2003->700
                  LINES: 21->1|26->2|27->3|28->4|31->7|31->7|33->9|33->9|33->9|37->13|37->13|38->14|38->14|38->14|39->15|39->15|42->18|42->18|43->19|45->21|45->21|47->23|47->23|47->23
                  -- GENERATED --
              */
          