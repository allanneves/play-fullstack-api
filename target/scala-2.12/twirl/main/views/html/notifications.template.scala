
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

object notifications extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/if(!flash.isEmpty)/*1.20*/ {_display_(Seq[Any](format.raw/*1.22*/("""
    """),format.raw/*2.5*/("""<section class="container">
        """),_display_(/*3.10*/for(key <- flash.keySet) yield /*3.34*/ {_display_(Seq[Any](format.raw/*3.36*/("""
            """),format.raw/*4.13*/("""<p class="alert alert-"""),_display_(/*4.36*/key),format.raw/*4.39*/(""" """),format.raw/*4.40*/("""text-"""),_display_(/*4.46*/key),format.raw/*4.49*/("""">
                """),_display_(/*5.18*/flash/*5.23*/.get(key)),format.raw/*5.32*/("""
            """),format.raw/*6.13*/("""</p>
        """)))}),format.raw/*7.10*/("""
    """),format.raw/*8.5*/("""</section>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 17 00:35:49 IST 2017
                  SOURCE: /Users/allan/dev/projects/learning/play-fullstack-api/app/views/notifications.scala.html
                  HASH: 9e60294d0c587d58404de78875c2ec0880fcf3ea
                  MATRIX: 1038->1|1064->19|1103->21|1134->26|1197->63|1236->87|1275->89|1315->102|1364->125|1387->128|1415->129|1447->135|1470->138|1516->158|1529->163|1558->172|1598->185|1642->199|1673->204
                  LINES: 33->1|33->1|33->1|34->2|35->3|35->3|35->3|36->4|36->4|36->4|36->4|36->4|36->4|37->5|37->5|37->5|38->6|39->7|40->8
                  -- GENERATED --
              */
          