package com.myapp.model;

/**
 * Reprezentuje produkt w symulatorze zakupów.
 */
public class Product {
    private String name;
    private double price;

    /**
     * Tworzy nową instancję obiektu Product.
     *
     * @param name  nazwa produktu
     * @param price cena produktu
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Zwraca nazwę produktu.
     *
     * @return nazwa produktu
     */
    public String getName() {
        return name;
    }

    /**
     * Ustawia nazwę produktu.
     *
     * @param name nazwa produktu
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Zwraca cenę produktu.
     *
     * @return cena produktu
     */
    public double getPrice() {
        return price;
    }

    /**
     * Ustawia cenę produktu.
     *
     * @param price cena produktu
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
