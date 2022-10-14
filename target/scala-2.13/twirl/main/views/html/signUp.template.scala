
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
    <h1 class="header">What Book Next...</h1>

    <ul class="navigation">
        <li>Browse by</li>
        <li><a href=""""),_display_(/*11.23*/controllers/*11.34*/.routes.ApplicationController.home()),format.raw/*11.70*/("""">Home</a></li>
        <li>Search</li>
    </ul>
</div>
<h2 class="pageTitle">Sign Up</h2>
<div class="signUpBox">
<img class="signInImg" src="/assets/images/signupPic.jpg" alt="library ladder">

<form class="signupForm" method="post" autocomplete="on">
    Email: <input type="text" name="usernameEmail"><br>
    username: <input type="text" name="name"><br>
    Password: <input type="text" name="password"><br>
    <input type="submit">
</form>
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
                  DATE: 2022-10-14T16:08:26.755
                  SOURCE: /Users/robyn.garlington/Documents/scalaTraining/bookRecsProject/bookRecs/app/views/signUp.scala.html
                  HASH: bedb30f0698eb547a2ff576e091885bbd8d24846
                  MATRIX: 432->1|767->24|887->51|915->54|938->69|976->70|1003->71|1185->226|1205->237|1262->273
                  LINES: 17->1|22->2|27->3|29->5|29->5|29->5|30->6|35->11|35->11|35->11
                  -- GENERATED --
              */
          