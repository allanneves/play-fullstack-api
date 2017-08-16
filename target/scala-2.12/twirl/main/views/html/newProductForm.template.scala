
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

object newProductForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import b3.vertical.fieldConstructor


Seq[Any](format.raw/*1.23*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Product Management")/*5.28*/ {_display_(Seq[Any](format.raw/*5.30*/("""
    """),_display_(/*6.6*/b3/*6.8*/.form(routes.ProductController.saveNewProduct)/*6.54*/{_display_(Seq[Any](format.raw/*6.55*/("""
        """),format.raw/*7.9*/("""<h1>Product Management</h1>
        """),_display_(/*8.10*/b3/*8.12*/.text(form("title"), '_label -> "Title")),format.raw/*8.52*/("""
        """),_display_(/*9.10*/b3/*9.12*/.text(form("code"), '_label -> "Code")),format.raw/*9.50*/("""
        """),_display_(/*10.10*/b3/*10.12*/.text(form("type"), '_label -> "Type")),format.raw/*10.50*/("""
        """),_display_(/*11.10*/b3/*11.12*/.textarea(form("description"), '_label -> "Description")),format.raw/*11.68*/("""
        """),_display_(/*12.10*/b3/*12.12*/.number(form("price"), '_label -> "Price")),format.raw/*12.54*/("""
        """),_display_(/*13.10*/b3/*13.12*/.submit('class -> "btn btn-primary")/*13.48*/ {_display_(Seq[Any](format.raw/*13.50*/(""" """),format.raw/*13.51*/("""New Product """)))}),format.raw/*13.64*/("""
    """)))}),format.raw/*14.6*/("""
""")))}),format.raw/*15.2*/("""
"""))
      }
    }
  }

  def render(form:Form[Product]): play.twirl.api.HtmlFormat.Appendable = apply(form)

  def f:((Form[Product]) => play.twirl.api.HtmlFormat.Appendable) = (form) => apply(form)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 17 00:35:49 IST 2017
                  SOURCE: /Users/allan/dev/projects/learning/play-fullstack-api/app/views/newProductForm.scala.html
                  HASH: 09a68db983f35716802287463afa2f8e3ac9d6b6
                  MATRIX: 964->1|1058->25|1123->22|1151->61|1178->63|1212->89|1251->91|1282->97|1291->99|1345->145|1383->146|1418->155|1481->192|1491->194|1551->234|1587->244|1597->246|1655->284|1692->294|1703->296|1762->334|1799->344|1810->346|1887->402|1924->412|1935->414|1998->456|2035->466|2046->468|2091->504|2131->506|2160->507|2204->520|2240->526|2272->528
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|38->6|38->6|38->6|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|46->14|47->15
                  -- GENERATED --
              */
          