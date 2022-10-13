
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

"""),format.raw/*4.1*/("""<h1>What Book Next ...</h1>

<div class="navigation">
  <ul>
    <li>Browse by</li>
    <li><a href=""""),_display_(/*9.19*/controllers/*9.30*/.routes.ApplicationController.home()),format.raw/*9.66*/("""">Home</a></li>
    <li>Search</li>
  </ul>
</div>
""")))}),format.raw/*13.2*/("""
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
                  DATE: 2022-10-13T16:49:28.941
                  SOURCE: /Users/robyn.garlington/Documents/scalaTraining/bookRecsProject/bookRecs/app/views/home.scala.html
                  HASH: c32980a5c9f209ea089e61a4f211051b63f268aa
                  MATRIX: 721->1|817->5|847->27|885->28|913->30|1041->132|1060->143|1116->179|1198->231
                  LINES: 21->1|26->2|26->2|26->2|28->4|33->9|33->9|33->9|37->13
                  -- GENERATED --
              */
          