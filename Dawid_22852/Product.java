package com.myapp.model;


public class Product {
    private String name;
    private double price;


    public Product(String name, double price) {
        // Konstruktor klasy Product
        this.name = name;
        this.price = price;
    }

    public String getName() {
        // Metoda getName zwraca nazwę produktu
        return name;
    }

    public void setName(String name) {
        // Metoda setName ustawia nową nazwę produktu na podstawie przekazanego argumentu
        this.name = name;
    }

    public double getPrice() {
        // Metoda getPrice zwraca cenę produktu
        return price;
    }

    public void setPrice(double price) {
        // Metoda setPrice ustawia nową cenę produktu na podstawie przekazanego argumentu
        this.price = price;
    }
}
