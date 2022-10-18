
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>"""),_display_(/*6.17*/title),format.raw/*6.22*/("""</title>
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*7.70*/routes/*7.76*/.Assets.versioned("/stylesheets/main.css")),format.raw/*7.118*/("""">
        <link rel="shortcut icon" type="image/x-icon" href="../assets/images/WBNicon.png">
<!--        <a target="_blank" href="https://icons8.com/icon/kU7-FkDru7LN/storytelling">Storytelling</a> icon by <a target="_blank" href="https://icons8.com">Icons8</a>-->
    </head>
    <body>

        """),_display_(/*13.10*/content),format.raw/*13.17*/("""

      """),format.raw/*15.7*/("""<script src="javascripts/main.js" type="text/javascript"></script>


    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-10-18T14:52:13.024
                  SOURCE: /Users/robyn.garlington/Documents/scalaTraining/bookRecsProject/bookRecs/app/views/main.scala.html
                  HASH: 092c46b5a5037c78c3f9f4dd0e97624ead35bfef
                  MATRIX: 733->1|857->32|884->33|970->93|995->98|1099->176|1113->182|1176->224|1502->523|1530->530|1565->538
                  LINES: 21->1|26->2|27->3|30->6|30->6|31->7|31->7|31->7|37->13|37->13|39->15
                  -- GENERATED --
              */
          