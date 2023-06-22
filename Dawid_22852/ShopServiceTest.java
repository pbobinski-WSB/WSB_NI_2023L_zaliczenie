package com.myapp.service;

import com.myapp.model.Product;
import com.myapp.model.ShoppingCart;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Klasa ShopServiceTest zawiera testy jednostkowe dla klasy ShopService.
 */
public class ShopServiceTest {
    private ShopService shopService;
    private ShoppingCart cart;
    private Product product1;
    private Product product2;

    /**
     * Przygotowanie danych przed wykonaniem każdego testu.
     */
    @BeforeEach
    public void setup() {
        shopService = new ShopService();
        cart = new ShoppingCart();
        product1 = new Product("Product 1", 10.0);
        product2 = new Product("Product 2", 20.0);
    }

    /**
     * Testuje dodawanie produktu do koszyka.
     */
    @Test
    public void testAddToCart() {
        shopService.addToCart(cart, product1);
        Assertions.assertEquals(1, cart.getProducts().size());

        shopService.addToCart(cart, product2);
        Assertions.assertEquals(2, cart.getProducts().size());
    }

    /**
     * Testuje usuwanie produktu z koszyka.
     */
    @Test
    public void testRemoveFromCart() {
        shopService.addToCart(cart, product1);
        shopService.addToCart(cart, product2);

        shopService.removeFromCart(cart, product1);
        Assertions.assertEquals(1, cart.getProducts().size());
        Assertions.assertEquals(product2, cart.getProducts().get(0));
    }

    /**
     * Testuje obliczanie całkowitej ceny zamówienia.
     */
    @Test
    public void testCalculateTotalPrice() {
        shopService.addToCart(cart, product1);
        shopService.addToCart(cart, product2);

        double totalPrice = shopService.calculateTotalPrice(cart);
        Assertions.assertEquals(30.0, totalPrice);
    }
}
