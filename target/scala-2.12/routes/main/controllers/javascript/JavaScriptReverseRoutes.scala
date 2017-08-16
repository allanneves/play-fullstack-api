
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/allan/dev/projects/learning/play-fullstack-api/conf/routes
// @DATE:Thu Aug 17 00:35:49 IST 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseProductController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def saveNewProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.saveNewProduct",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "product/new"})
        }
      """
    )
  
    // @LINE:6
    def newProductForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.newProductForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/new"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseApiController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def allProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiController.allProducts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/products/all"})
        }
      """
    )
  
    // @LINE:12
    def fromType: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiController.fromType",
      """
        function(type0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/products/type/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("type", type0))})
        }
      """
    )
  
    // @LINE:10
    def filtered: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiController.filtered",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/products"})
        }
      """
    )
  
  }


}
