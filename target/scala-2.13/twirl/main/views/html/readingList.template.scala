
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

object readingList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[BookModel],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(readingList: Seq[BookModel]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>reading list</title>
</head>
<body>
<h1>Reading list</h1>
    """),_display_(/*12.6*/readingList/*12.17*/.map/*12.21*/{book =>_display_(Seq[Any](format.raw/*12.29*/("""
        """),format.raw/*13.9*/("""<h3>"""),_display_(/*13.14*/book/*13.18*/.title),format.raw/*13.24*/("""</h3>
        <ul>
            <li>"""),_display_(/*15.18*/book/*15.22*/.description),format.raw/*15.34*/("""</li>
            <li>"""),_display_(/*16.18*/book/*16.22*/.image),format.raw/*16.28*/("""</li>
        </ul>
    """)))}),format.raw/*18.6*/("""
"""),format.raw/*19.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(readingList:Seq[BookModel]): play.twirl.api.HtmlFormat.Appendable = apply(readingList)

  def f:((Seq[BookModel]) => play.twirl.api.HtmlFormat.Appendable) = (readingList) => apply(readingList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-10-11T12:22:30.964
                  SOURCE: /Users/robyn.garlington/Documents/scalaTraining/bookRecsProject/bookRecs/app/views/readingList.scala.html
                  HASH: e7e7056f28416667d3c34e43c4c633a9f0f3e9d0
                  MATRIX: 432->1|774->26|897->56|924->57|1091->198|1111->209|1124->213|1170->221|1206->230|1238->235|1251->239|1278->245|1341->281|1354->285|1387->297|1437->320|1450->324|1477->330|1532->355|1560->356
                  LINES: 17->1|22->2|27->3|28->4|36->12|36->12|36->12|36->12|37->13|37->13|37->13|37->13|39->15|39->15|39->15|40->16|40->16|40->16|42->18|43->19
                  -- GENERATED --
              */
          