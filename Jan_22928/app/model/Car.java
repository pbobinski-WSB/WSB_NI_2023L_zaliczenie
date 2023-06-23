package com.app.model;

public class Car {
    private Person owner;
    private String make;
    private String model;

    public Car(Person owner, String make, String model){
        this.owner = owner;
        this.make = make;
        this.model = model;
    }

    public Person getOwner(){
        return this.owner;
    }

    public String getMakeAndModel(){
        return this.make+" "+this.model;
    }

}
