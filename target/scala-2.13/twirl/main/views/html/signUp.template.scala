
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
    <div >
        <img class="headingBanner" src="/assets/images/bannerPic.jpg" alt="books piled with writing what book next over the top">
    </div>
    <ul class="navigation">
        <li>Browse by</li>
        <li><a href=""""),_display_(/*12.23*/controllers/*12.34*/.routes.ApplicationController.home()),format.raw/*12.70*/("""">Home</a></li>
        <li>Search</li>
        <li><a href=""""),_display_(/*14.23*/controllers/*14.34*/.routes.ApplicationController.signIn()),format.raw/*14.72*/("""">Sign In</a></li>
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
                  DATE: 2022-10-18T14:46:58.760
                  SOURCE: /Users/robyn.garlington/Documents/scalaTraining/bookRecsProject/bookRecs/app/views/signUp.scala.html
                  HASH: 95c8dd95938fec95c22b7e1bf1c83a9429f6f209
                  MATRIX: 432->1|767->24|887->51|915->54|938->69|976->70|1003->71|1290->331|1310->342|1367->378|1456->440|1476->451|1535->489
                  LINES: 17->1|22->2|27->3|29->5|29->5|29->5|30->6|36->12|36->12|36->12|38->14|38->14|38->14
                  -- GENERATED --
              */
          