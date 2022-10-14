
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
    <h1 class="header">What Book Next...</h1>

    <ul class="navigation">
        <li>Browse by</li>
        <li><a href=""""),_display_(/*12.23*/controllers/*12.34*/.routes.ApplicationController.home()),format.raw/*12.70*/("""">Home</a></li>
        <li>Search</li>
    </ul>
</div>
<h2 class="pageTitle">Sign In/Up</h2>
<div class="signUpFromSignIn">
<p>If you do not have an account then</p>
<p><a href=""""),_display_(/*19.14*/controllers/*19.25*/.routes.ApplicationController.signUp()),format.raw/*19.63*/("""">Sign Up</a></p>
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
                  DATE: 2022-10-14T16:34:24.212
                  SOURCE: /Users/robyn.garlington/Documents/scalaTraining/bookRecsProject/bookRecs/app/views/signInUp.scala.html
                  HASH: 23e3eea6aa97ccae2d1d842f0ebcbd5dab4bbc43
                  MATRIX: 432->1|769->24|889->51|917->54|940->69|978->70|1006->72|1188->227|1208->238|1265->274|1473->455|1493->466|1552->504
                  LINES: 17->1|22->2|27->3|29->5|29->5|29->5|31->7|36->12|36->12|36->12|43->19|43->19|43->19
                  -- GENERATED --
              */
          