
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
/*1.2*/import forms.UserLogin
/*2.2*/import helper._

object signInUp extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[UserLogin],RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(userLoginForm: Form[UserLogin])(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""

"""),_display_(/*6.2*/main("sign in")/*6.17*/{_display_(Seq[Any](format.raw/*6.18*/("""

"""),format.raw/*8.1*/("""<div class="headerBackground">
    <div class="homeImageTextContainer">
        <img class="headingBanner" src="/assets/images/creative-assortment-with-different-books.jpg" alt="books piled with writing what book next over the top">
        <h1 class="whatBookNext">What</h1> <h1 class="bookTitle">Book</h1> <p class="inner rotate">Next</p>
        <p class="textImageAttribution">Image by <a href="https://www.freepik.com/free-photo/creative-assortment-with-different-books_12407510.htm">Freepik</a></p>
    </div>
    <ul class="navigation">
        <li>Browse by</li>
        <li><a href=""""),_display_(/*16.23*/controllers/*16.34*/.routes.ApplicationController.home()),format.raw/*16.70*/("""">Home</a></li>
        <li>Search</li>
    </ul>
</div>
<div class="loginBackground">
    <h2 class="pageTitle">Sign In</h2>
    <div class="signUpFromSignIn">
        """),_display_(/*23.10*/helper/*23.16*/.form(action = routes.ApplicationController.signInPost())/*23.73*/ {_display_(Seq[Any](format.raw/*23.75*/("""
        """),_display_(/*24.10*/helper/*24.16*/.CSRF.formField),format.raw/*24.31*/("""
        """),_display_(/*25.10*/helper/*25.16*/.inputText(userLoginForm("usernameEmail"))),format.raw/*25.58*/("""
        """),_display_(/*26.10*/helper/*26.16*/.inputPassword(userLoginForm("password"))),format.raw/*26.57*/("""
        """),format.raw/*27.9*/("""<input type="submit" value="Submit">
        """)))}),format.raw/*28.10*/("""
        """),format.raw/*29.9*/("""<p>If you do not have an account then</p>
        <p><a href=""""),_display_(/*30.22*/controllers/*30.33*/.routes.ApplicationController.signUp()),format.raw/*30.71*/("""">Sign Up</a></p>
    </div>
</div>
""")))}))
      }
    }
  }

  def render(userLoginForm:Form[UserLogin],request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(userLoginForm)(request,messages)

  def f:((Form[UserLogin]) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (userLoginForm) => (request,messages) => apply(userLoginForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/signInUp.scala.html
                  HASH: 2272900ff41c1506e02d783f10a11abe74a58bf7
                  MATRIX: 432->1|462->25|817->42|996->128|1024->131|1047->146|1085->147|1113->149|1733->742|1753->753|1810->789|2007->959|2022->965|2088->1022|2128->1024|2165->1034|2180->1040|2216->1055|2253->1065|2268->1071|2331->1113|2368->1123|2383->1129|2445->1170|2481->1179|2558->1225|2594->1234|2684->1297|2704->1308|2763->1346
                  LINES: 17->1|18->2|23->3|28->4|30->6|30->6|30->6|32->8|40->16|40->16|40->16|47->23|47->23|47->23|47->23|48->24|48->24|48->24|49->25|49->25|49->25|50->26|50->26|50->26|51->27|52->28|53->29|54->30|54->30|54->30
                  -- GENERATED --
              */
          