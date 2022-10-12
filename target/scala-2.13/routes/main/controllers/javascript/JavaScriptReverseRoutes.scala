// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/robyn.garlington/Documents/scalaTraining/bookRecsProject/bookRecs/conf/routes
// @DATE:Tue Oct 11 17:39:15 BST 2022

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers.javascript {

  // @LINE:3
  class ReverseApplicationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def findBook: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.findBook",
      """
        function(search0,term1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "findBook/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("search", search0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("term", term1))})
        }
      """
    )
  
    // @LINE:10
    def updateUserName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.updateUserName",
      """
        function(username0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "userprofile/updatename/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("username", username0))})
        }
      """
    )
  
    // @LINE:17
    def getGoogleBook: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.getGoogleBook",
      """
        function(search0,term1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "library/getGoogle/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("search", search0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("term", term1))})
        }
      """
    )
  
    // @LINE:4
    def createUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.createUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userprofile/create/user"})
        }
      """
    )
  
    // @LINE:8
    def showReadList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.showReadList",
      """
        function(username0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userprofile/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("username", username0)) + "/readlist"})
        }
      """
    )
  
    // @LINE:5
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
  
    // @LINE:11
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.delete",
      """
        function(username0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "userprofile/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("username", username0))})
        }
      """
    )
  
    // @LINE:9
    def addToReading: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.addToReading",
      """
        function(username0,search1,term2) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "userprofile/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("username", username0)) + "/readinglist/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("search", search1)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("term", term2)) + "/addreading"})
        }
      """
    )
  
  }

  // @LINE:2
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
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
