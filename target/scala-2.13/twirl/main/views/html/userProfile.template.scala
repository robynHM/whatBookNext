
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
/*1.2*/import models.UserModel

object userProfile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[UserModel,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: UserModel):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>userProfile</title>
</head>
<body>
<h1>Hi """),_display_(/*11.9*/user/*11.13*/.name),format.raw/*11.18*/("""</h1>
<div>

  <ul>
    <li><a href="""),_display_(/*15.18*/controllers/*15.29*/.routes.ApplicationController.showReadingList(user.userName)),format.raw/*15.89*/(""">Reading List</a></li>
    <li><a href="""),_display_(/*16.18*/controllers/*16.29*/.routes.ApplicationController.showReadList(user.userName)),format.raw/*16.86*/(""">Read List</a></li>
  </ul>

</div>
</body>
</html>"""))
      }
    }
  }

  def render(user:UserModel): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((UserModel) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-10-18T14:46:58.749
                  SOURCE: /Users/robyn.garlington/Documents/scalaTraining/bookRecsProject/bookRecs/app/views/userProfile.scala.html
                  HASH: dd1c3b1d4d397f78506491ced2477417e5b0d4e8
                  MATRIX: 432->1|769->26|880->44|907->45|1050->162|1063->166|1089->171|1153->208|1173->219|1254->279|1321->319|1341->330|1419->387
                  LINES: 17->1|22->2|27->3|28->4|35->11|35->11|35->11|39->15|39->15|39->15|40->16|40->16|40->16
                  -- GENERATED --
              */
          