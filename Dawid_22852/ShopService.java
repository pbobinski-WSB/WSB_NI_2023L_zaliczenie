package com.myapp.service;

import com.myapp.model.Product;
import com.myapp.model.ShoppingCart;

public class ShopService {
    // Metoda dodająca produkt do koszyka
    public void addToCart(ShoppingCart cart, Product product) {
        cart.addProduct(product);
    }

    // Metoda usuwająca produkt z koszyka
    public void removeFromCart(ShoppingCart cart, Product product) {
        cart.removeProduct(product);
    }

    // Metoda obliczająca całkowitą wartość koszyka
    public double calculateTotalPrice(ShoppingCart cart) {
        double totalPrice = 0.0;
        
        // Iteracja przez wszystkie produkty w koszyku
        for (Product product : cart.getProducts()) {
            // Dodawanie ceny produktu do całkowitej wartości koszyka
            totalPrice += product.getPrice();
        }
        
        return totalPrice;
    }
}
