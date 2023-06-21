package com.myapp.service;

import com.myapp.model.Product;
import com.myapp.model.ShoppingCart;

public class ShopService {
    public void addToCart(ShoppingCart cart, Product product) {
        cart.addProduct(product);
    }

    public void removeFromCart(ShoppingCart cart, Product product) {
        cart.removeProduct(product);
    }

    public double calculateTotalPrice(ShoppingCart cart) {
        double totalPrice = 0.0;
        for (Product product : cart.getProducts()) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
