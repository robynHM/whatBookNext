
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
    <div class="homeImageTextContainer">
        <img class="headingBanner" src="/assets/images/creative-assortment-with-different-books.jpg" alt="books piled with writing what book next over the top">
        <h1 class="whatBookNext">What</h1> <h1 class="bookTitle">Book</h1> <p class="inner rotate">Next</p>
        <p class="textImageAttribution">Image by <a href="https://www.freepik.com/free-photo/creative-assortment-with-different-books_12407510.htm">Freepik</a></p>
    </div>
    <ul class="navigation">
      <li>Browse by</li>
      <li><a href=""""),_display_(/*11.21*/controllers/*11.32*/.routes.ApplicationController.home()),format.raw/*11.68*/("""">Home</a></li>
      <li>Search</li>
      <li><a href=""""),_display_(/*13.21*/controllers/*13.32*/.routes.ApplicationController.signIn()),format.raw/*13.70*/("""">Sign In</a></li>
    </ul>
</div>
<div class="homeImageTextContainer">
    <img class="homeImg" src="/assets/images/homePic.jpg" alt="book and coffee">
    <div class="writingOnHomeImage">Here we aim to find you your next book obsession. You can browse by your favourite genre or for more tailored recommendations login in or sign up.</div>
</div>
""")))}),format.raw/*20.2*/("""
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
                  SOURCE: app/views/home.scala.html
                  HASH: ca682b253b7dfc1fabe260491af73aa63e614c26
                  MATRIX: 721->1|817->5|847->27|885->28|912->29|1528->618|1548->629|1605->665|1690->723|1710->734|1769->772|2150->1123
                  LINES: 21->1|26->2|26->2|26->2|27->3|35->11|35->11|35->11|37->13|37->13|37->13|44->20
                  -- GENERATED --
              */
          