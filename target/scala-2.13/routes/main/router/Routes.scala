// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/robyn.garlington/Documents/scalaTraining/bookRecsProject/bookRecs/conf/routes
// @DATE:Tue Oct 18 14:46:58 BST 2022

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:2
  ApplicationController_0: controllers.ApplicationController,
  // @LINE:17
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:2
    ApplicationController_0: controllers.ApplicationController,
    // @LINE:17
    Assets_1: controllers.Assets
  ) = this(errorHandler, ApplicationController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ApplicationController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.ApplicationController.home()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userprofile/""" + "$" + """username<[^/]+>/readinglist""", """controllers.ApplicationController.showReadingList(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userprofile/""" + "$" + """username<[^/]+>""", """controllers.ApplicationController.showUserAccount(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """findbook/""" + "$" + """search<[^/]+>/""" + "$" + """term<[^/]+>""", """controllers.ApplicationController.findBook(search:String, term:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userprofile/""" + "$" + """username<[^/]+>/readinglist""", """controllers.ApplicationController.showReadingList(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userprofile/""" + "$" + """username<[^/]+>/readlist""", """controllers.ApplicationController.showReadList(username:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userprofile/updatename/""" + "$" + """username<[^/]+>""", """controllers.ApplicationController.updateUserName(username:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userprofile/""" + "$" + """username<[^/]+>""", """controllers.ApplicationController.delete(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signin""", """controllers.ApplicationController.signIn()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signin""", """controllers.ApplicationController.signInPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.ApplicationController.signUp()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.ApplicationController.signUpPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getimage""", """controllers.ApplicationController.getimage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """library/getGoogle/""" + "$" + """search<[^/]+>/""" + "$" + """term<[^/]+>""", """controllers.ApplicationController.getGoogleBook(search:String, term:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:2
  private[this] lazy val controllers_ApplicationController_home0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_ApplicationController_home0_invoker = createInvoker(
    ApplicationController_0.home(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "home",
      Nil,
      "GET",
      this.prefix + """home""",
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
  private[this] lazy val controllers_ApplicationController_showUserAccount2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userprofile/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApplicationController_showUserAccount2_invoker = createInvoker(
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

  // @LINE:5
  private[this] lazy val controllers_ApplicationController_findBook3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("findbook/"), DynamicPart("search", """[^/]+""",true), StaticPart("/"), DynamicPart("term", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApplicationController_findBook3_invoker = createInvoker(
    ApplicationController_0.findBook(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "findBook",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """findbook/""" + "$" + """search<[^/]+>/""" + "$" + """term<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_ApplicationController_showReadingList4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userprofile/"), DynamicPart("username", """[^/]+""",true), StaticPart("/readinglist")))
  )
  private[this] lazy val controllers_ApplicationController_showReadingList4_invoker = createInvoker(
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

  // @LINE:7
  private[this] lazy val controllers_ApplicationController_showReadList5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userprofile/"), DynamicPart("username", """[^/]+""",true), StaticPart("/readlist")))
  )
  private[this] lazy val controllers_ApplicationController_showReadList5_invoker = createInvoker(
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

  // @LINE:8
  private[this] lazy val controllers_ApplicationController_updateUserName6_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userprofile/updatename/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApplicationController_updateUserName6_invoker = createInvoker(
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

  // @LINE:9
  private[this] lazy val controllers_ApplicationController_delete7_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userprofile/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApplicationController_delete7_invoker = createInvoker(
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

  // @LINE:10
  private[this] lazy val controllers_ApplicationController_signIn8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signin")))
  )
  private[this] lazy val controllers_ApplicationController_signIn8_invoker = createInvoker(
    ApplicationController_0.signIn(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "signIn",
      Nil,
      "GET",
      this.prefix + """signin""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ApplicationController_signInPost9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signin")))
  )
  private[this] lazy val controllers_ApplicationController_signInPost9_invoker = createInvoker(
    ApplicationController_0.signInPost(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "signInPost",
      Nil,
      "POST",
      this.prefix + """signin""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ApplicationController_signUp10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_ApplicationController_signUp10_invoker = createInvoker(
    ApplicationController_0.signUp(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "signUp",
      Nil,
      "GET",
      this.prefix + """signup""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ApplicationController_signUpPost11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_ApplicationController_signUpPost11_invoker = createInvoker(
    ApplicationController_0.signUpPost(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "signUpPost",
      Nil,
      "POST",
      this.prefix + """signup""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ApplicationController_getimage12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getimage")))
  )
  private[this] lazy val controllers_ApplicationController_getimage12_invoker = createInvoker(
    ApplicationController_0.getimage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "getimage",
      Nil,
      "GET",
      this.prefix + """getimage""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Assets_versioned13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned13_invoker = createInvoker(
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

  // @LINE:20
  private[this] lazy val controllers_ApplicationController_getGoogleBook14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("library/getGoogle/"), DynamicPart("search", """[^/]+""",true), StaticPart("/"), DynamicPart("term", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApplicationController_getGoogleBook14_invoker = createInvoker(
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
    case controllers_ApplicationController_home0_route(params@_) =>
      call { 
        controllers_ApplicationController_home0_invoker.call(ApplicationController_0.home())
      }
  
    // @LINE:3
    case controllers_ApplicationController_showReadingList1_route(params@_) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_ApplicationController_showReadingList1_invoker.call(ApplicationController_0.showReadingList(username))
      }
  
    // @LINE:4
    case controllers_ApplicationController_showUserAccount2_route(params@_) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_ApplicationController_showUserAccount2_invoker.call(ApplicationController_0.showUserAccount(username))
      }
  
    // @LINE:5
    case controllers_ApplicationController_findBook3_route(params@_) =>
      call(params.fromPath[String]("search", None), params.fromPath[String]("term", None)) { (search, term) =>
        controllers_ApplicationController_findBook3_invoker.call(ApplicationController_0.findBook(search, term))
      }
  
    // @LINE:6
    case controllers_ApplicationController_showReadingList4_route(params@_) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_ApplicationController_showReadingList4_invoker.call(ApplicationController_0.showReadingList(username))
      }
  
    // @LINE:7
    case controllers_ApplicationController_showReadList5_route(params@_) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_ApplicationController_showReadList5_invoker.call(ApplicationController_0.showReadList(username))
      }
  
    // @LINE:8
    case controllers_ApplicationController_updateUserName6_route(params@_) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_ApplicationController_updateUserName6_invoker.call(ApplicationController_0.updateUserName(username))
      }
  
    // @LINE:9
    case controllers_ApplicationController_delete7_route(params@_) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_ApplicationController_delete7_invoker.call(ApplicationController_0.delete(username))
      }
  
    // @LINE:10
    case controllers_ApplicationController_signIn8_route(params@_) =>
      call { 
        controllers_ApplicationController_signIn8_invoker.call(ApplicationController_0.signIn())
      }
  
    // @LINE:11
    case controllers_ApplicationController_signInPost9_route(params@_) =>
      call { 
        controllers_ApplicationController_signInPost9_invoker.call(ApplicationController_0.signInPost())
      }
  
    // @LINE:12
    case controllers_ApplicationController_signUp10_route(params@_) =>
      call { 
        controllers_ApplicationController_signUp10_invoker.call(ApplicationController_0.signUp())
      }
  
    // @LINE:13
    case controllers_ApplicationController_signUpPost11_route(params@_) =>
      call { 
        controllers_ApplicationController_signUpPost11_invoker.call(ApplicationController_0.signUpPost())
      }
  
    // @LINE:14
    case controllers_ApplicationController_getimage12_route(params@_) =>
      call { 
        controllers_ApplicationController_getimage12_invoker.call(ApplicationController_0.getimage())
      }
  
    // @LINE:17
    case controllers_Assets_versioned13_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned13_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:20
    case controllers_ApplicationController_getGoogleBook14_route(params@_) =>
      call(params.fromPath[String]("search", None), params.fromPath[String]("term", None)) { (search, term) =>
        controllers_ApplicationController_getGoogleBook14_invoker.call(ApplicationController_0.getGoogleBook(search, term))
      }
  }
}
