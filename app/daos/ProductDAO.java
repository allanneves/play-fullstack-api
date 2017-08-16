package daos;

import io.ebean.ExpressionList;
import io.ebean.Finder;
import models.Product;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ProductDAO {

    private Finder<Long, Product> products = new Finder<>(Product.class);

    public Optional<Product> fromCode(String code){
        Product product = products.query().where().eq("code", code).findUnique();
        return Optional.ofNullable(product);
    }

    public List<Product> all() {
        return products.all();
    }

    public List<Product> fromType(String type) {
        return products.query().where().eq("type", type).findList();
    }

    public List<Product> filtered(Map<String, String> parameters) {
        ExpressionList<Product> query = products.query().where();
        parameters.entrySet().forEach(entry -> {
            query.eq(entry.getKey(), entry.getValue());
        });
        return query.findList();
    }
}
