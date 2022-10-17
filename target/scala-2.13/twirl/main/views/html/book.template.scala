
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
"""),_display_(/*4.2*/main("Book search")/*4.21*/{_display_(Seq[Any](format.raw/*4.22*/("""
"""),format.raw/*5.1*/("""<div class="headerBackground">
    <div >
        <img class="headingBanner" src="/assets/images/bannerPic.jpg" alt="books piled with writing what book next over the top">
    </div>
    <ul class="navigation">
        <li>Browse by</li>
        <li><a href=""""),_display_(/*11.23*/controllers/*11.34*/.routes.ApplicationController.home()),format.raw/*11.70*/("""">Home</a></li>
        <li>Search</li>
        <li><a href=""""),_display_(/*13.23*/controllers/*13.34*/.routes.ApplicationController.signIn()),format.raw/*13.72*/("""">Sign In/Up</a></li>
    </ul>
</div>

<h1 class="pageTitle">"""),_display_(/*17.24*/book/*17.28*/.title),format.raw/*17.34*/("""</h1>

<div class="bookSearchContainer">
<img class = "bookCover" src= "/assets/images/signupPic.jpg" alt="image of a book cover">
    <div class="bookSearchText">
        """),_display_(/*22.10*/book/*22.14*/.author.map/*22.25*/{name =>_display_(Seq[Any](format.raw/*22.33*/("""
            """),format.raw/*23.13*/("""<p class="authorName">"""),_display_(/*23.36*/name),format.raw/*23.40*/("""</p>
        """)))}),format.raw/*24.10*/("""
        """),format.raw/*25.9*/("""<div class="iconContainers">

            <img class= "icon" src= "/assets/images/addToReadingIcon.png" alt="plus symbol">
            <span class="hideText">Add to your reading list</span>

            <img class= "icon" src= "/assets/images/addToReadIcon.png" alt="end book symbol">
            <span class="hideText">Add to your read list</span>

         </div>
        <ul class="bookSearchDetails">
            <li>"""),_display_(/*35.18*/book/*35.22*/.description),format.raw/*35.34*/("""</li>
        </ul>
    </div>
</div>
""")))}),format.raw/*39.2*/("""

"""))
      }
    }
  }

  def render(book:BookModel): play.twirl.api.HtmlFormat.Appendable = apply(book)

  def f:((BookModel) => play.twirl.api.HtmlFormat.Appendable) = (book) => apply(book)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-10-17T15:35:13.014
                  SOURCE: /Users/robyn.garlington/Documents/scalaTraining/bookRecsProject/bookRecs/app/views/book.scala.html
                  HASH: 06cfad58f28dfb74ff86e55318d2ef7bc6fc796f
                  MATRIX: 432->1|762->26|873->44|900->46|927->65|965->66|992->67|1279->327|1299->338|1356->374|1445->436|1465->447|1524->485|1614->548|1627->552|1654->558|1854->731|1867->735|1887->746|1933->754|1974->767|2024->790|2049->794|2094->808|2130->817|2579->1239|2592->1243|2625->1255|2694->1294
                  LINES: 17->1|22->2|27->3|28->4|28->4|28->4|29->5|35->11|35->11|35->11|37->13|37->13|37->13|41->17|41->17|41->17|46->22|46->22|46->22|46->22|47->23|47->23|47->23|48->24|49->25|59->35|59->35|59->35|63->39
                  -- GENERATED --
              */
          