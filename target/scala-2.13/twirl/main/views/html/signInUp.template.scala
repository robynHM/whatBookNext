
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
    <div >
        <img class="headingBanner" src="/assets/images/bannerPic.jpg" alt="books piled with writing what book next over the top">
    </div>
    <ul class="navigation">
        <li>Browse by</li>
        <li><a href=""""),_display_(/*13.23*/controllers/*13.34*/.routes.ApplicationController.home()),format.raw/*13.70*/("""">Home</a></li>
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
        <p><a href=""""),_display_(/*26.22*/controllers/*26.33*/.routes.ApplicationController.signUp()),format.raw/*26.71*/("""">Sign Up</a></p>
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
                  DATE: 2022-10-18T14:46:58.774
                  SOURCE: /Users/robyn.garlington/Documents/scalaTraining/bookRecsProject/bookRecs/app/views/signInUp.scala.html
                  HASH: 3f54a8f7ba6d9663d941c36d5e5aa0c76c24a944
                  MATRIX: 432->1|769->24|889->51|917->54|940->69|978->70|1006->72|1293->332|1313->343|1370->379|1871->853|1891->864|1950->902
                  LINES: 17->1|22->2|27->3|29->5|29->5|29->5|31->7|37->13|37->13|37->13|50->26|50->26|50->26
                  -- GENERATED --
              */
          