
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
/*1.2*/import forms.UserData
/*2.2*/import helper._

object signUp extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[UserData],RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(userForm: Form[UserData])(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""

"""),_display_(/*6.2*/main("sign up")/*6.17*/{_display_(Seq[Any](format.raw/*6.18*/("""
"""),format.raw/*7.1*/("""<div class="headerBackground">
    <div class="homeImageTextContainer">
        <img class="headingBanner" src="/assets/images/creative-assortment-with-different-books.jpg" alt="books piled with writing what book next over the top">
        <h1 class="whatBookNext">What</h1> <h1 class="bookTitle">Book</h1> <p class="inner rotate">Next</p>
        <p class="textImageAttribution">Image by <a href="https://www.freepik.com/free-photo/creative-assortment-with-different-books_12407510.htm">Freepik</a></p>
    </div>
    <ul class="navigation">
        <li>Browse by</li>
        <li><a href=""""),_display_(/*15.23*/controllers/*15.34*/.routes.ApplicationController.home()),format.raw/*15.70*/("""">Home</a></li>
        <li>Search</li>
        <li><a href=""""),_display_(/*17.23*/controllers/*17.34*/.routes.ApplicationController.signIn()),format.raw/*17.72*/("""">Sign In</a></li>
    </ul>
</div>
<div class="bookSearchBackground">
    <h2 class="pageTitle">Sign Up</h2>
    <div class="signUpBox">
        <img class="signInImg" src="/assets/images/signupPic.jpg" alt="library ladder">
        <div class="signupForm">
            """),_display_(/*25.14*/helper/*25.20*/.form(action = routes.ApplicationController.signUpPost())/*25.77*/ {_display_(Seq[Any](format.raw/*25.79*/("""
            """),_display_(/*26.14*/helper/*26.20*/.CSRF.formField),format.raw/*26.35*/("""
            """),_display_(/*27.14*/helper/*27.20*/.inputText(userForm("usernameEmail"))),format.raw/*27.57*/("""
            """),_display_(/*28.14*/helper/*28.20*/.inputText(userForm("name"))),format.raw/*28.48*/("""
            """),_display_(/*29.14*/helper/*29.20*/.inputPassword(userForm("password"))),format.raw/*29.56*/("""
            """),format.raw/*30.13*/("""<input type="submit" value="Submit">
            """)))}),format.raw/*31.14*/("""
        """),format.raw/*32.9*/("""</div>
    </div>
</div>
""")))}))
      }
    }
  }

  def render(userForm:Form[UserData],request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(userForm)(request,messages)

  def f:((Form[UserData]) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => (request,messages) => apply(userForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/signUp.scala.html
                  HASH: 5db9361de266700aa9fb6f9e5b72cb4d986950af
                  MATRIX: 432->1|461->24|813->41|986->121|1014->124|1037->139|1075->140|1102->141|1722->734|1742->745|1799->781|1888->843|1908->854|1967->892|2266->1164|2281->1170|2347->1227|2387->1229|2428->1243|2443->1249|2479->1264|2520->1278|2535->1284|2593->1321|2634->1335|2649->1341|2698->1369|2739->1383|2754->1389|2811->1425|2852->1438|2933->1488|2969->1497
                  LINES: 17->1|18->2|23->3|28->4|30->6|30->6|30->6|31->7|39->15|39->15|39->15|41->17|41->17|41->17|49->25|49->25|49->25|49->25|50->26|50->26|50->26|51->27|51->27|51->27|52->28|52->28|52->28|53->29|53->29|53->29|54->30|55->31|56->32
                  -- GENERATED --
              */
          