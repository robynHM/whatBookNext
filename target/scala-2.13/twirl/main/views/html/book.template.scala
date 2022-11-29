
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
    <div class="homeImageTextContainer">
        <img class="headingBanner" src="/assets/images/creative-assortment-with-different-books.jpg" alt="books piled with writing what book next over the top">
        <h1 class="whatBookNext">What</h1> <h1 class="bookTitle">Book</h1> <p class="inner rotate">Next</p>
        <p class="textImageAttribution">Image by <a href="https://www.freepik.com/free-photo/creative-assortment-with-different-books_12407510.htm">Freepik</a></p>
    </div>
    <ul class="navigation">
        <li>Browse by</li>
        <li><a href=""""),_display_(/*13.23*/controllers/*13.34*/.routes.ApplicationController.home()),format.raw/*13.70*/("""">Home</a></li>
        <li>Search</li>
        <li><a href=""""),_display_(/*15.23*/controllers/*15.34*/.routes.ApplicationController.signIn()),format.raw/*15.72*/("""">Sign In</a></li>
    </ul>
</div>
<div class="bookSearchBackground">

<h1 class="pageTitle">"""),_display_(/*20.24*/book/*20.28*/.title),format.raw/*20.34*/("""</h1>

<div class="bookSearchContainer">

<img class="bookCover" src= """"),_display_(/*24.31*/book/*24.35*/.image),format.raw/*24.41*/("""" alt="image of a book cover">
    <div class="bookSearchText">
        """),_display_(/*26.10*/book/*26.14*/.author.map/*26.25*/{name =>_display_(Seq[Any](format.raw/*26.33*/("""
            """),format.raw/*27.13*/("""<p class="authorName">"""),_display_(/*27.36*/name),format.raw/*27.40*/("""</p>
        """)))}),format.raw/*28.10*/("""
        """),format.raw/*29.9*/("""<div class="iconContainers">

            <img class= "icon" src= "/assets/images/addToReadingIcon.png" alt="plus symbol">
            <span class="hideText">Add to reading</span>

            <img class= "icon" src= "/assets/images/addToReadIcon.png" alt="end book symbol">
            <span class="hideText">Add to read</span>

         </div>
        <ul class="bookSearchDetails">
            <li>"""),_display_(/*39.18*/book/*39.22*/.description),format.raw/*39.34*/("""</li>
        </ul>
    </div>
</div>
</div>
""")))}),format.raw/*44.2*/("""

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
                  SOURCE: app/views/book.scala.html
                  HASH: cc3a46036a5480bca8795b1c3f6acac508174db9
                  MATRIX: 432->1|762->26|873->44|900->46|927->65|965->66|992->67|1612->660|1632->671|1689->707|1778->769|1798->780|1857->818|1979->913|1992->917|2019->923|2118->995|2131->999|2158->1005|2258->1078|2271->1082|2291->1093|2337->1101|2378->1114|2428->1137|2453->1141|2498->1155|2534->1164|2963->1566|2976->1570|3009->1582|3085->1628
                  LINES: 17->1|22->2|27->3|28->4|28->4|28->4|29->5|37->13|37->13|37->13|39->15|39->15|39->15|44->20|44->20|44->20|48->24|48->24|48->24|50->26|50->26|50->26|50->26|51->27|51->27|51->27|52->28|53->29|63->39|63->39|63->39|68->44
                  -- GENERATED --
              */
          