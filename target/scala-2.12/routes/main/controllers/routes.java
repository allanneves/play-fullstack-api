
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/allan/dev/projects/learning/play-fullstack-api/conf/routes
// @DATE:Thu Aug 17 00:35:49 IST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseProductController ProductController = new controllers.ReverseProductController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApiController ApiController = new controllers.ReverseApiController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseProductController ProductController = new controllers.javascript.ReverseProductController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApiController ApiController = new controllers.javascript.ReverseApiController(RoutesPrefix.byNamePrefix());
  }

}
