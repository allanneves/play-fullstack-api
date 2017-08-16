package controllers;

import models.Product;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import validators.ProductValidator;
import views.html.newProductForm;

import javax.inject.Inject;

public class ProductController extends Controller {

    @Inject
    private FormFactory forms;

    @Inject
    private ProductValidator productValidator;

    public Result saveNewProduct() {
        Form<Product> productForm = forms.form(Product.class).bindFromRequest();
        Product product = productForm.get();

        if (productValidator.hasErrors(productForm)) {
            flash("danger", "There are errors on the form.");
            return badRequest(newProductForm.render(productForm));
        }
        product.save();
        flash("success", "Product " + product.getTitle() + " successfully inserted.");
        return redirect(routes.ProductController.newProductForm());
    }

    public Result newProductForm() {
        Product product = new Product();
        Form<Product> form = forms.form(Product.class).fill(product);
        return ok(views.html.newProductForm.render(form));
    }

}
