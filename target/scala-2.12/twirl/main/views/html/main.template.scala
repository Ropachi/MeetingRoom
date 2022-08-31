
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
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>"""),_display_(/*6.17*/title),format.raw/*6.22*/("""</title>
        <link rel="stylesheet" media="screen"
        href=""""),_display_(/*8.16*/routes/*8.22*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.63*/("""">
    </head>
    <body>
        <header class="row">
            <div class="header">"""),_display_(/*12.34*/header),format.raw/*12.40*/("""</div>
            <img src=""""),_display_(/*13.24*/routes/*13.30*/.Assets.versioned("images/meetingroom.png")),format.raw/*13.73*/("""">
            <h1>"""),_display_(/*14.18*/title),format.raw/*14.23*/("""</h1>
        </header>
        <article class="row">
        """),_display_(/*17.10*/content),format.raw/*17.17*/("""
        """),format.raw/*18.9*/("""</article>
        <footer class="row">
            <p>"""),_display_(/*20.17*/footer),format.raw/*20.23*/("""</p>
        </footer>
        <script src=""""),_display_(/*22.23*/routes/*22.29*/.Assets.versioned("javascripts/main.js")),format.raw/*22.69*/("""" type="text/javascript"></script>
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
                  DATE: Tue Aug 02 11:24:08 JST 2022
                  SOURCE: /home/ito/IdeaProjects/play2_scala_会議室予約システム/app/views/main.scala.html
                  HASH: f64b1aa57eaa6fb64240bb607d39fd12244a4119
                  MATRIX: 747->1|903->64|930->65|1016->125|1041->130|1137->200|1151->206|1212->247|1327->335|1354->341|1411->371|1426->377|1490->420|1537->440|1563->445|1653->508|1681->515|1717->524|1800->580|1827->586|1899->631|1914->637|1975->677
                  LINES: 21->1|26->2|27->3|30->6|30->6|32->8|32->8|32->8|36->12|36->12|37->13|37->13|37->13|38->14|38->14|41->17|41->17|42->18|44->20|44->20|46->22|46->22|46->22
                  -- GENERATED --
              */
          