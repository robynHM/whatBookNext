
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

object home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("What Book Next")/*2.24*/{_display_(Seq[Any](format.raw/*2.25*/("""
"""),format.raw/*3.1*/("""<div class="headerBackground">
    <h1 class="header">What Book Next...</h1>

    <ul class="navigation">
      <li>Browse by</li>
      <li><a href=""""),_display_(/*8.21*/controllers/*8.32*/.routes.ApplicationController.home()),format.raw/*8.68*/("""">Home</a></li>
      <li>Search</li>
      <li><a href=""""),_display_(/*10.21*/controllers/*10.32*/.routes.ApplicationController.signIn()),format.raw/*10.70*/("""">Sign In/Up</a></li>
    </ul>
</div>
<img class="homeImg" src="/assets/images/homePic.png" alt="book and coffee">
""")))}),format.raw/*14.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-10-14T15:52:55.854
                  SOURCE: /Users/robyn.garlington/Documents/scalaTraining/bookRecsProject/bookRecs/app/views/home.scala.html
                  HASH: ca591e73f612c0e92ed96998d323af087b2e6efd
                  MATRIX: 721->1|817->5|847->27|885->28|912->29|1089->180|1108->191|1164->227|1249->285|1269->296|1328->334|1475->451
                  LINES: 21->1|26->2|26->2|26->2|27->3|32->8|32->8|32->8|34->10|34->10|34->10|38->14
                  -- GENERATED --
              */
          