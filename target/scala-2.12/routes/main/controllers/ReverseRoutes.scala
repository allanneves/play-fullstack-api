
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/allan/dev/projects/learning/play-fullstack-api/conf/routes
// @DATE:Thu Aug 17 00:35:49 IST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseProductController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def saveNewProduct(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "product/new")
    }
  
    // @LINE:6
    def newProductForm(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "product/new")
    }
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:10
  class ReverseApiController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def allProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/products/all")
    }
  
    // @LINE:12
    def fromType(_pf_escape_type:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/products/type/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("type", _pf_escape_type)))
    }
  
    // @LINE:10
    def filtered(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/products")
    }
  
  }


}
