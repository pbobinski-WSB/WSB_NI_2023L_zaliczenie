package com.app.model;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;



public class Person{
    @NotNull(message = "Name cannot be null")
    private String name;
    private int phoneNumber;
    @Size(min=11,max=11, message="Pesel must be 11 characters long")
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