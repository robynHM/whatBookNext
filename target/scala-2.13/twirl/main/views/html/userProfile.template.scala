
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
"""),_display_(/*4.2*/main("userProfile")/*4.21*/{_display_(Seq[Any](format.raw/*4.22*/("""

"""),format.raw/*6.1*/("""<div class="headerBackground">
  <div class="homeImageTextContainer">
    <img class="headingBanner" src="/assets/images/creative-assortment-with-different-books.jpg" alt="books piled with writing what book next over the top">
    <h1 class="whatBookNext">What</h1> <h1 class="bookTitle">Book</h1> <p class="inner rotate">Next</p>
    <p class="textImageAttribution">Image by <a href="https://www.freepik.com/free-photo/creative-assortment-with-different-books_12407510.htm">Freepik</a></p>
  </div>
  <ul class="navigation">
    <li>Browse by</li>
    <li><a href=""""),_display_(/*14.19*/controllers/*14.30*/.routes.ApplicationController.home()),format.raw/*14.66*/("""">Home</a></li>
    <li>Search</li>
  </ul>
</div>
<div class="usersProfileBackground">
  <h1 class="pageTitle">Hi """),_display_(/*19.29*/user/*19.33*/.name),format.raw/*19.38*/("""</h1>
  <div>

    <ul>
      <li><a href="""),_display_(/*23.20*/controllers/*23.31*/.routes.ApplicationController.showReadingList(user.userName)),format.raw/*23.91*/(""">Reading List</a></li>
      <li><a href="""),_display_(/*24.20*/controllers/*24.31*/.routes.ApplicationController.showReadList(user.userName)),format.raw/*24.88*/(""">Read List</a></li>
    </ul>

  </div>

</div>
""")))}),format.raw/*30.2*/("""

"""))
      }
    }
  }

  def render(user:UserModel): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((UserModel) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/userProfile.scala.html
                  HASH: 5a70ea3b175adc1981ff81e4c1e9a868a202b83d
                  MATRIX: 432->1|769->26|880->44|907->46|934->65|972->66|1000->68|1594->635|1614->646|1671->682|1814->798|1827->802|1853->807|1923->850|1943->861|2024->921|2093->963|2113->974|2191->1031|2270->1080
                  LINES: 17->1|22->2|27->3|28->4|28->4|28->4|30->6|38->14|38->14|38->14|43->19|43->19|43->19|47->23|47->23|47->23|48->24|48->24|48->24|54->30
                  -- GENERATED --
              */
          