// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/robyn.garlington/Documents/scalaTraining/bookRecsProject/bookRecs/conf/routes
// @DATE:Thu Oct 13 16:31:26 BST 2022

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers.javascript {

  // @LINE:2
  class ReverseApplicationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def findBook: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.findBook",
      """
        function(search0,term1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "findBook/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("search", search0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("term", term1))})
        }
      """
    )
  
    // @LINE:12
    def signUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.signUp",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:8
    def updateUserName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.updateUserName",
      """
        function(username0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "userprofile/updatename/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("username", username0))})
        }
      """
    )
  
    // @LINE:19
    def getGoogleBook: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.getGoogleBook",
      """
        function(search0,term1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "library/getGoogle/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("search", search0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("term", term1))})
        }
      """
    )
  
    // @LINE:7
    def showReadList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.showReadList",
      """
        function(username0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userprofile/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("username", username0)) + "/readlist"})
        }
      """
    )
  
    // @LINE:11
    def signInPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.signInPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signin"})
        }
      """
    )
  
    // @LINE:4
    def showUserAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.showUserAccount",
      """
        function(username0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userprofile/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("username", username0))})
        }
      """
    )
  
    // @LINE:3
    def showReadingList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.showReadingList",
      """
        function(username0) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userprofile/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("username", username0)) + "/readinglist"})
          }
        
        }
      """
    )
  
    // @LINE:9
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.delete",
      """
        function(username0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "userprofile/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("username", username0))})
        }
      """
    )
  
    // @LINE:13
    def signUpPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.signUpPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:2
    def home: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.home",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
        }
      """
    )
  
    // @LINE:10
    def signIn: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.signIn",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signin"})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
