// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/robyn.garlington/Documents/scalaTraining/bookRecsProject/bookRecs/conf/routes
// @DATE:Tue Oct 11 17:39:15 BST 2022

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:2
  HomeController_2: controllers.HomeController,
  // @LINE:3
  ApplicationController_0: controllers.ApplicationController,
  // @LINE:14
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:2
    HomeController_2: controllers.HomeController,
    // @LINE:3
    ApplicationController_0: controllers.ApplicationController,
    // @LINE:14
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_2, ApplicationController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, ApplicationController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userprofile/""" + "$" + """username<[^/]+>/readinglist""", """controllers.ApplicationController.showReadingList(username:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userprofile/create/user""", """controllers.ApplicationController.createUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userprofile/""" + "$" + """username<[^/]+>""", """controllers.ApplicationController.showUserAccount(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """findBook/""" + "$" + """search<[^/]+>/""" + "$" + """term<[^/]+>""", """controllers.ApplicationController.findBook(search:String, term:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userprofile/""" + "$" + """username<[^/]+>/readinglist""", """controllers.ApplicationController.showReadingList(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userprofile/""" + "$" + """username<[^/]+>/readlist""", """controllers.ApplicationController.showReadList(username:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userprofile/""" + "$" + """username<[^/]+>/readinglist/""" + "$" + """search<[^/]+>/""" + "$" + """term<[^/]+>/addreading""", """controllers.ApplicationController.addToReading(username:String, search:String, term:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userprofile/updatename/""" + "$" + """username<[^/]+>""", """controllers.ApplicationController.updateUserName(username:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userprofile/""" + "$" + """username<[^/]+>""", """controllers.ApplicationController.delete(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """library/getGoogle/""" + "$" + """search<[^/]+>/""" + "$" + """term<[^/]+>""", """controllers.ApplicationController.getGoogleBook(search:String, term:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:2
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:3
  private[this] lazy val controllers_ApplicationController_showReadingList1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userprofile/"), DynamicPart("username", """[^/]+""",true), StaticPart("/readinglist")))
  )
  private[this] lazy val controllers_ApplicationController_showReadingList1_invoker = createInvoker(
    ApplicationController_0.showReadingList(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "showReadingList",
      Seq(classOf[String]),
      "GET",
      this.prefix + """userprofile/""" + "$" + """username<[^/]+>/readinglist""",
      """""",
      Seq()
    )
  )

  // @LINE:4
  private[this] lazy val controllers_ApplicationController_createUser2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userprofile/create/user")))
  )
  private[this] lazy val controllers_ApplicationController_createUser2_invoker = createInvoker(
    ApplicationController_0.createUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "createUser",
      Nil,
      "POST",
      this.prefix + """userprofile/create/user""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_ApplicationController_showUserAccount3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userprofile/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApplicationController_showUserAccount3_invoker = createInvoker(
    ApplicationController_0.showUserAccount(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "showUserAccount",
      Seq(classOf[String]),
      "GET",
      this.prefix + """userprofile/""" + "$" + """username<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_ApplicationController_findBook4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("findBook/"), DynamicPart("search", """[^/]+""",true), StaticPart("/"), DynamicPart("term", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApplicationController_findBook4_invoker = createInvoker(
    ApplicationController_0.findBook(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "findBook",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """findBook/""" + "$" + """search<[^/]+>/""" + "$" + """term<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_ApplicationController_showReadingList5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userprofile/"), DynamicPart("username", """[^/]+""",true), StaticPart("/readinglist")))
  )
  private[this] lazy val controllers_ApplicationController_showReadingList5_invoker = createInvoker(
    ApplicationController_0.showReadingList(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "showReadingList",
      Seq(classOf[String]),
      "GET",
      this.prefix + """userprofile/""" + "$" + """username<[^/]+>/readinglist""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_ApplicationController_showReadList6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userprofile/"), DynamicPart("username", """[^/]+""",true), StaticPart("/readlist")))
  )
  private[this] lazy val controllers_ApplicationController_showReadList6_invoker = createInvoker(
    ApplicationController_0.showReadList(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "showReadList",
      Seq(classOf[String]),
      "GET",
      this.prefix + """userprofile/""" + "$" + """username<[^/]+>/readlist""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ApplicationController_addToReading7_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userprofile/"), DynamicPart("username", """[^/]+""",true), StaticPart("/readinglist/"), DynamicPart("search", """[^/]+""",true), StaticPart("/"), DynamicPart("term", """[^/]+""",true), StaticPart("/addreading")))
  )
  private[this] lazy val controllers_ApplicationController_addToReading7_invoker = createInvoker(
    ApplicationController_0.addToReading(fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "addToReading",
      Seq(classOf[String], classOf[String], classOf[String]),
      "PUT",
      this.prefix + """userprofile/""" + "$" + """username<[^/]+>/readinglist/""" + "$" + """search<[^/]+>/""" + "$" + """term<[^/]+>/addreading""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ApplicationController_updateUserName8_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userprofile/updatename/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApplicationController_updateUserName8_invoker = createInvoker(
    ApplicationController_0.updateUserName(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "updateUserName",
      Seq(classOf[String]),
      "PUT",
      this.prefix + """userprofile/updatename/""" + "$" + """username<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ApplicationController_delete9_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userprofile/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApplicationController_delete9_invoker = createInvoker(
    ApplicationController_0.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """userprofile/""" + "$" + """username<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_versioned10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned10_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ApplicationController_getGoogleBook11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("library/getGoogle/"), DynamicPart("search", """[^/]+""",true), StaticPart("/"), DynamicPart("term", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApplicationController_getGoogleBook11_invoker = createInvoker(
    ApplicationController_0.getGoogleBook(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "getGoogleBook",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """library/getGoogle/""" + "$" + """search<[^/]+>/""" + "$" + """term<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:2
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index())
      }
  
    // @LINE:3
    case controllers_ApplicationController_showReadingList1_route(params@_) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_ApplicationController_showReadingList1_invoker.call(ApplicationController_0.showReadingList(username))
      }
  
    // @LINE:4
    case controllers_ApplicationController_createUser2_route(params@_) =>
      call { 
        controllers_ApplicationController_createUser2_invoker.call(ApplicationController_0.createUser())
      }
  
    // @LINE:5
    case controllers_ApplicationController_showUserAccount3_route(params@_) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_ApplicationController_showUserAccount3_invoker.call(ApplicationController_0.showUserAccount(username))
      }
  
    // @LINE:6
    case controllers_ApplicationController_findBook4_route(params@_) =>
      call(params.fromPath[String]("search", None), params.fromPath[String]("term", None)) { (search, term) =>
        controllers_ApplicationController_findBook4_invoker.call(ApplicationController_0.findBook(search, term))
      }
  
    // @LINE:7
    case controllers_ApplicationController_showReadingList5_route(params@_) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_ApplicationController_showReadingList5_invoker.call(ApplicationController_0.showReadingList(username))
      }
  
    // @LINE:8
    case controllers_ApplicationController_showReadList6_route(params@_) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_ApplicationController_showReadList6_invoker.call(ApplicationController_0.showReadList(username))
      }
  
    // @LINE:9
    case controllers_ApplicationController_addToReading7_route(params@_) =>
      call(params.fromPath[String]("username", None), params.fromPath[String]("search", None), params.fromPath[String]("term", None)) { (username, search, term) =>
        controllers_ApplicationController_addToReading7_invoker.call(ApplicationController_0.addToReading(username, search, term))
      }
  
    // @LINE:10
    case controllers_ApplicationController_updateUserName8_route(params@_) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_ApplicationController_updateUserName8_invoker.call(ApplicationController_0.updateUserName(username))
      }
  
    // @LINE:11
    case controllers_ApplicationController_delete9_route(params@_) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_ApplicationController_delete9_invoker.call(ApplicationController_0.delete(username))
      }
  
    // @LINE:14
    case controllers_Assets_versioned10_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned10_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:17
    case controllers_ApplicationController_getGoogleBook11_route(params@_) =>
      call(params.fromPath[String]("search", None), params.fromPath[String]("term", None)) { (search, term) =>
        controllers_ApplicationController_getGoogleBook11_invoker.call(ApplicationController_0.getGoogleBook(search, term))
      }
  }
}
