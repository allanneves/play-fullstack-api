
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
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>"""),_display_(/*5.17*/title),format.raw/*5.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*7.54*/routes/*7.60*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*7.112*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.versioned("images/favicon.png")),format.raw/*8.104*/("""">
    </head>
    <body>
        """),_display_(/*11.10*/notifications()),format.raw/*11.25*/("""
        """),format.raw/*12.9*/("""<main class="container">"""),_display_(/*12.34*/content),format.raw/*12.41*/("""</main>
        <script type="text/javascript" src=""""),_display_(/*13.46*/routes/*13.52*/.Assets.versioned("bootstrap/js/jquery.min.js")),format.raw/*13.99*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*14.46*/routes/*14.52*/.Assets.versioned("bootstrap/js/bootstrap.min.js")),format.raw/*14.102*/(""""></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 17 00:35:49 IST 2017
                  SOURCE: /Users/allan/dev/projects/learning/play-fullstack-api/app/views/main.scala.html
                  HASH: e6a1417eb7c70fe3053d946ef38a10024b721cbf
                  MATRIX: 952->1|1077->31|1104->32|1190->92|1215->97|1380->236|1394->242|1467->294|1554->355|1568->361|1628->400|1690->435|1726->450|1762->459|1814->484|1842->491|1922->544|1937->550|2005->597|2089->654|2104->660|2176->710
                  LINES: 28->1|33->1|34->2|37->5|37->5|39->7|39->7|39->7|40->8|40->8|40->8|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14
                  -- GENERATED --
              */
          