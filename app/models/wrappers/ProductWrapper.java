package models.wrappers;

import models.Product;

import java.util.List;

public class ProductWrapper {

    private List<Product> products;

    public ProductWrapper(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }
}
