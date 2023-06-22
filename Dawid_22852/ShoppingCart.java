package com.myapp.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasa ShoppingCart reprezentuje koszyk zakupowy, który przechowuje listę produktów.
 */
public class ShoppingCart {
    private List<Product> products;

    /**
     * Konstruktor tworzy nowy pusty koszyk zakupowy.
     */
    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    /**
     * Dodaje produkt do koszyka zakupowego.
     *
     * @param product produkt, który ma zostać dodany do koszyka
     */
    public void addProduct(Product product) {
        products.add(product);
    }

    /**
     * Usuwa produkt z koszyka zakupowego.
     *
     * @param product produkt, który ma zostać usunięty z koszyka
     */
    public void removeProduct(Product product) {
        products.remove(product);
    }

    /**
     * Pobiera listę produktów znajdujących się w koszyku zakupowym.
     *
     * @return lista produktów w koszyku zakupowym
     */
    public List<Product> getProducts() {
        return products;
    }
}
