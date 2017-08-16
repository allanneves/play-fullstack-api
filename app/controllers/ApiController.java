package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import daos.ProductDAO;
import models.Product;
import models.wrappers.ProductWrapper;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.data.validation.ValidationError;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ApiController extends Controller {

    private static final List<String> ATTRIBUTES = Arrays.asList("id", "title", "code", "type", "price");

    @Inject
    private ProductDAO productDAO;

    @Inject
    private FormFactory forms;

    public Result allProducts() {
        ProductWrapper productWrapper = new ProductWrapper(productDAO.all());
        return ok(Json.toJson(productWrapper));
    }

    public Result fromType(String type) {
        ProductWrapper productWrapper = new ProductWrapper(productDAO.fromType(type));
        return ok(Json.toJson(productWrapper));
    }

    public Result filtered() {
        DynamicForm form = forms.form().bindFromRequest();
        formValidation(form);
        if (form.hasErrors()) {
            JsonNode errors = Json.newObject().set("errors", form.errorsAsJson());
            return badRequest(errors);
        }
        Map<String, String> parameters = form.rawData();
        List<Product> products = productDAO.filtered(parameters);
        ProductWrapper productWrapper = new ProductWrapper(products);
        return ok(Json.toJson(productWrapper));
    }

    private void formValidation(DynamicForm form) {
        Map<String, String> parameters = form.rawData();
        parameters.keySet().forEach(key -> {
            if (!ATTRIBUTES.contains(key)) {
                form.reject(new ValidationError("Invalid Attributes", key));
            }
        });
    }
}
