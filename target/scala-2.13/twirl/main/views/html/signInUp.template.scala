
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

object signInUp extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[UserData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userForm: Form[UserData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""

"""),_display_(/*5.2*/main("sign in")/*5.17*/{_display_(Seq[Any](format.raw/*5.18*/("""

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
    </ul>
</div>
<div class="loginBackground">
    <h2 class="pageTitle">Sign In</h2>
    <div class="signUpFromSignIn">
        <form class="signInForm" method="post" autocomplete="on">
            Email: <input type="text" name="usernameEmail"><br>
            Password: <input type="text" name="password"><br>
            <input type="submit">
        </form>
        <p>If you do not have an account then</p>
        <p><a href=""""),_display_(/*28.22*/controllers/*28.33*/.routes.ApplicationController.signUp()),format.raw/*28.71*/("""">Sign Up</a></p>
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
                  DATE: 2022-10-19T13:13:16.177
                  SOURCE: /Users/robyn.garlington/Documents/scalaTraining/bookRecsProject/bookRecs/app/views/signInUp.scala.html
                  HASH: 7235e3bcdef77d17a7660fffcb9be86d1e64fc5c
                  MATRIX: 432->1|769->24|889->51|917->54|940->69|978->70|1006->72|1626->665|1646->676|1703->712|2204->1186|2224->1197|2283->1235
                  LINES: 17->1|22->2|27->3|29->5|29->5|29->5|31->7|39->15|39->15|39->15|52->28|52->28|52->28
                  -- GENERATED --
              */
          