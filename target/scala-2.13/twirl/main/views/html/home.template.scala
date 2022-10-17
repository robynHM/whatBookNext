
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
    <div >
        <img class="headingBanner" src="/assets/images/bannerPic.jpg" alt="books piled with writing what book next over the top">
    </div>
    <ul class="navigation">
      <li>Browse by</li>
      <li><a href=""""),_display_(/*9.21*/controllers/*9.32*/.routes.ApplicationController.home()),format.raw/*9.68*/("""">Home</a></li>
      <li>Search</li>
      <li><a href=""""),_display_(/*11.21*/controllers/*11.32*/.routes.ApplicationController.signIn()),format.raw/*11.70*/("""">Sign In/Up</a></li>
    </ul>
</div>
<img class="homeImg" src="/assets/images/homePic.png" alt="book and coffee">
""")))}),format.raw/*15.2*/("""
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
                  DATE: 2022-10-17T09:29:06.269
                  SOURCE: /Users/robyn.garlington/Documents/scalaTraining/bookRecsProject/bookRecs/app/views/home.scala.html
                  HASH: 0f1da75143b9f0a1f2b8e39b7f6d3d21178615b4
                  MATRIX: 721->1|817->5|847->27|885->28|912->29|1194->285|1213->296|1269->332|1354->390|1374->401|1433->439|1580->556
                  LINES: 21->1|26->2|26->2|26->2|27->3|33->9|33->9|33->9|35->11|35->11|35->11|39->15
                  -- GENERATED --
              */
          