// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/robyn.garlington/Documents/scalaTraining/bookRecsProject/bookRecs/conf/routes
// @DATE:Mon Oct 17 09:38:25 BST 2022

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers {

  // @LINE:2
  class ReverseApplicationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def findBook(search:String, term:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "findbook/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("search", search)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("term", term)))
    }
  
    // @LINE:12
    def signUp(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:8
    def updateUserName(username:String): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "userprofile/updatename/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
    // @LINE:19
    def getGoogleBook(search:String, term:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "library/getGoogle/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("search", search)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("term", term)))
    }
  
    // @LINE:7
    def showReadList(username:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userprofile/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/readlist")
    }
  
    // @LINE:11
    def signInPost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "signin")
    }
  
    // @LINE:4
    def showUserAccount(username:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userprofile/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
    // @LINE:3
    def showReadingList(username:String): Call = {
    
      (username: @unchecked) match {
      
        // @LINE:3
        case (username)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "userprofile/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/readinglist")
      
      }
    
    }
  
    // @LINE:9
    def delete(username:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "userprofile/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
    // @LINE:13
    def signUpPost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:2
    def home(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "home")
    }
  
    // @LINE:10
    def signIn(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signin")
    }
  
  }

  // @LINE:16
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
