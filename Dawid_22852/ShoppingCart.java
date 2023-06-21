package com.myapp.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    // Metoda dodająca produkt do koszyka
    public void addProduct(Product product) {
        products.add(product);
    }

    // Metoda usuwająca produkt z koszyka
    public void removeProduct(Product product) {
        products.remove(product);
    }

    // Metoda zwracająca listę produktów w koszyku
    public List<Product> getProducts() {
        return products;
    }
}
