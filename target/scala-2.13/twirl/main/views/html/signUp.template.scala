
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

object signUp extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[UserData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userForm: Form[UserData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""

"""),_display_(/*5.2*/main("sign up")/*5.17*/{_display_(Seq[Any](format.raw/*5.18*/("""
"""),format.raw/*6.1*/("""<div class="headerBackground">
    <div class="homeImageTextContainer">
        <img class="headingBanner" src="/assets/images/creative-assortment-with-different-books.jpg" alt="books piled with writing what book next over the top">
        <h1 class="whatBookNext">What</h1> <h1 class="bookTitle">Book</h1> <p class="inner rotate">Next</p>
        <p class="textImageAttribution">Image by <a href="https://www.freepik.com/free-photo/creative-assortment-with-different-books_12407510.htm">Freepik</a></p>
    </div>
    <ul class="navigation">
        <li>Browse by</li>
        <li><a href=""""),_display_(/*14.23*/controllers/*14.34*/.routes.ApplicationController.home()),format.raw/*14.70*/("""">Home</a></li>
        <li>Search</li>
        <li><a href=""""),_display_(/*16.23*/controllers/*16.34*/.routes.ApplicationController.signIn()),format.raw/*16.72*/("""">Sign In</a></li>
    </ul>
</div>
<div class="bookSearchBackground">
<h2 class="pageTitle">Sign Up</h2>
<div class="signUpBox">
<img class="signInImg" src="/assets/images/signupPic.jpg" alt="library ladder">

<form class="signupForm" method="post" autocomplete="on">
    Email: <input type="text" name="usernameEmail"><br>
    Username: <input type="text" name="name"><br>
    Password: <input type="text" name="password"><br>
    <input type="submit">
</form>
</div>
</div>
""")))}))
      }
    }
  }

  def render(userForm:Form[UserData]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[UserData]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-10-19T13:13:16.148
                  SOURCE: /Users/robyn.garlington/Documents/scalaTraining/bookRecsProject/bookRecs/app/views/signUp.scala.html
                  HASH: f38740123dcae2bdd62dd5554f694e019015865b
                  MATRIX: 432->1|767->24|887->51|915->54|938->69|976->70|1003->71|1623->664|1643->675|1700->711|1789->773|1809->784|1868->822
                  LINES: 17->1|22->2|27->3|29->5|29->5|29->5|30->6|38->14|38->14|38->14|40->16|40->16|40->16
                  -- GENERATED --
              */
          