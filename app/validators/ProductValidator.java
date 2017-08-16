package validators;

import daos.ProductDAO;
import models.Product;
import play.data.Form;
import play.data.validation.ValidationError;

import javax.inject.Inject;
import java.math.BigDecimal;

public class ProductValidator {

    @Inject
    private ProductDAO productDAO;

    public boolean hasErrors(Form<Product> form) {
        Product product = form.get();

        if (product.getPrice().compareTo(BigDecimal.ZERO) == -1) {
            form.reject(new ValidationError("price", "The product price must be higher or equal to zero."));
        }
        if (productDAO.fromCode(product.getCode()).isPresent()){
            form.reject(new ValidationError("code", "There is already a product with this code. Please use a different code."));
        }
        return form.hasErrors();
    }
}
