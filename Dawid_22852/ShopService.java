package com.myapp.service;

import com.myapp.model.Product;
import com.myapp.model.ShoppingCart;

/**
 * Klasa ShopService dostarcza operacje związane z obsługą sklepu, takie jak dodawanie produktów do koszyka,
 * usuwanie produktów z koszyka oraz obliczanie całkowitej ceny zamówienia.
 */
public class ShopService {

    /**
     * Dodaje produkt do koszyka zakupowego.
     *
     * @param cart    koszyk zakupowy, do którego ma zostać dodany produkt
     * @param product produkt, który ma zostać dodany do koszyka
     */
    public void addToCart(ShoppingCart cart, Product product) {
        cart.addProduct(product);
    }

    /**
     * Usuwa produkt z koszyka zakupowego.
     *
     * @param cart    koszyk zakupowy, z którego ma zostać usunięty produkt
     * @param product produkt, który ma zostać usunięty z koszyka
     */
    public void removeFromCart(ShoppingCart cart, Product product) {
        cart.removeProduct(product);
    }

    /**
     * Oblicza całkowitą cenę zamówienia na podstawie produktów znajdujących się w koszyku zakupowym.
     *
     * @param cart koszyk zakupowy, dla którego ma zostać obliczona cena
     * @return całkowita cena zamówienia
     */
    public double calculateTotalPrice(ShoppingCart cart) {
        double totalPrice = 0.0;

        for (Product product : cart.getProducts()) {
            totalPrice += product.getPrice();
        }

        return totalPrice;
    }
}
