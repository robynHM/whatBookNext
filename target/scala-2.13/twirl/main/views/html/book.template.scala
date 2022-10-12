
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
/*1.2*/import models.BookModel

object book extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[BookModel,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(book: BookModel):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>book search</title>
</head>
<body>
<h1>"""),_display_(/*11.6*/book/*11.10*/.title),format.raw/*11.16*/("""</h1>
<ul>
<!--    <li><a href=""""),_display_(/*13.23*/controllers/*13.34*/.routes.ApplicationController.addToReading()),format.raw/*13.78*/("""">Reading List</a></li>-->
<!--    need something to check if they are logged in or not button should lead to login page if login false if logged in then-->
</ul>
</body>
</html>"""))
      }
    }
  }

  def render(book:BookModel): play.twirl.api.HtmlFormat.Appendable = apply(book)

  def f:((BookModel) => play.twirl.api.HtmlFormat.Appendable) = (book) => apply(book)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-10-11T17:32:01.292
                  SOURCE: /Users/robyn.garlington/Documents/scalaTraining/bookRecsProject/bookRecs/app/views/book.scala.html
                  HASH: a3cef5df42a29391af306941c7c56e1892023caa
                  MATRIX: 432->1|762->26|873->44|900->45|1044->163|1057->167|1084->173|1144->206|1164->217|1229->261
                  LINES: 17->1|22->2|27->3|28->4|35->11|35->11|35->11|37->13|37->13|37->13
                  -- GENERATED --
              */
          