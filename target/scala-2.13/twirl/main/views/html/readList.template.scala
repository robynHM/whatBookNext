
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

object readList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[BookModel],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(readList: Seq[BookModel]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>read list</title>
</head>
<body>
    <h1>Books I have read</h1>
    """),_display_(/*12.6*/readList/*12.14*/.map/*12.18*/{book =>_display_(Seq[Any](format.raw/*12.26*/("""
        """),format.raw/*13.9*/("""<h3>"""),_display_(/*13.14*/book/*13.18*/.title),format.raw/*13.24*/("""</h3>
        <ul>
            <li>"""),_display_(/*15.18*/book/*15.22*/.description),format.raw/*15.34*/("""</li>
            <li>"""),_display_(/*16.18*/book/*16.22*/.image),format.raw/*16.28*/("""</li>
        </ul>
""")))}),format.raw/*18.2*/("""
"""),format.raw/*19.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(readList:Seq[BookModel]): play.twirl.api.HtmlFormat.Appendable = apply(readList)

  def f:((Seq[BookModel]) => play.twirl.api.HtmlFormat.Appendable) = (readList) => apply(readList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-10-11T12:42:27.699
                  SOURCE: /Users/robyn.garlington/Documents/scalaTraining/bookRecsProject/bookRecs/app/views/readList.scala.html
                  HASH: ed408dbd650edef91bf63727037194caf3407e33
                  MATRIX: 432->1|771->26|891->53|918->54|1091->201|1108->209|1121->213|1167->221|1203->230|1235->235|1248->239|1275->245|1338->281|1351->285|1384->297|1434->320|1447->324|1474->330|1525->351|1553->352
                  LINES: 17->1|22->2|27->3|28->4|36->12|36->12|36->12|36->12|37->13|37->13|37->13|37->13|39->15|39->15|39->15|40->16|40->16|40->16|42->18|43->19
                  -- GENERATED --
              */
          