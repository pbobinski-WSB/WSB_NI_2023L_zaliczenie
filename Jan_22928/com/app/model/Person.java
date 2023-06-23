package com.app.model;



public class Person{
    private String name;
    private int phoneNumber;
    private int pesel;
    private int address;
    private int age;

    public Person(String name, int phoneNumber, int pesel, int address, int age){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.pesel = pesel;
        this.address = address;
        this.age = age;
    }

    public String getName(){
        return name;
    }
}