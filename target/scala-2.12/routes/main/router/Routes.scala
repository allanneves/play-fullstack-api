
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/allan/dev/projects/learning/play-fullstack-api/conf/routes
// @DATE:Thu Aug 17 00:35:49 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ProductController_2: controllers.ProductController,
  // @LINE:10
  ApiController_0: controllers.ApiController,
  // @LINE:15
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ProductController_2: controllers.ProductController,
    // @LINE:10
    ApiController_0: controllers.ApiController,
    // @LINE:15
    Assets_1: controllers.Assets
  ) = this(errorHandler, ProductController_2, ApiController_0, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProductController_2, ApiController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/new""", """controllers.ProductController.newProductForm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/new""", """controllers.ProductController.saveNewProduct"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/products""", """controllers.ApiController.filtered"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/products/all""", """controllers.ApiController.allProducts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/products/type/""" + "$" + """type<[^/]+>""", """controllers.ApiController.fromType(type:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_ProductController_newProductForm0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/new")))
  )
  private[this] lazy val controllers_ProductController_newProductForm0_invoker = createInvoker(
    ProductController_2.newProductForm,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "newProductForm",
      Nil,
      "GET",
      this.prefix + """product/new""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_ProductController_saveNewProduct1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/new")))
  )
  private[this] lazy val controllers_ProductController_saveNewProduct1_invoker = createInvoker(
    ProductController_2.saveNewProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "saveNewProduct",
      Nil,
      "POST",
      this.prefix + """product/new""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ApiController_filtered2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/products")))
  )
  private[this] lazy val controllers_ApiController_filtered2_invoker = createInvoker(
    ApiController_0.filtered,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiController",
      "filtered",
      Nil,
      "GET",
      this.prefix + """api/products""",
      """ API Routes""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ApiController_allProducts3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/products/all")))
  )
  private[this] lazy val controllers_ApiController_allProducts3_invoker = createInvoker(
    ApiController_0.allProducts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiController",
      "allProducts",
      Nil,
      "GET",
      this.prefix + """api/products/all""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ApiController_fromType4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/products/type/"), DynamicPart("type", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApiController_fromType4_invoker = createInvoker(
    ApiController_0.fromType(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiController",
      "fromType",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/products/type/""" + "$" + """type<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
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


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_ProductController_newProductForm0_route(params) =>
      call { 
        controllers_ProductController_newProductForm0_invoker.call(ProductController_2.newProductForm)
      }
  
    // @LINE:7
    case controllers_ProductController_saveNewProduct1_route(params) =>
      call { 
        controllers_ProductController_saveNewProduct1_invoker.call(ProductController_2.saveNewProduct)
      }
  
    // @LINE:10
    case controllers_ApiController_filtered2_route(params) =>
      call { 
        controllers_ApiController_filtered2_invoker.call(ApiController_0.filtered)
      }
  
    // @LINE:11
    case controllers_ApiController_allProducts3_route(params) =>
      call { 
        controllers_ApiController_allProducts3_invoker.call(ApiController_0.allProducts)
      }
  
    // @LINE:12
    case controllers_ApiController_fromType4_route(params) =>
      call(params.fromPath[String]("type", None)) { (_pf_escape_type) =>
        controllers_ApiController_fromType4_invoker.call(ApiController_0.fromType(_pf_escape_type))
      }
  
    // @LINE:15
    case controllers_Assets_versioned5_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
