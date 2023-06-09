package app.model;

import app.utils.Utilities;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;


/**
 * Klasa osoba
 */
public class Person{
    @NotNull(message = "Name cannot be null")
    private String name;
    private int phoneNumber;
    @Size(min=11,max=11, message="Pesel must be 11 characters long")
    private String pesel;
    private String address;
    private int age;

    public Person(String name, int phoneNumber,String pesel, String address, int age){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.pesel = pesel;
        this.address = address;
        this.age = age;
    }

    /**
     * Getter imienia osoby
     * @return imie
     */
    public String getName(){
        return name;
    }

    /**
     * metoda liczy rok urodzenia na podstawie wieku
     * @return rok urodzenia
     */
    public int getDateOfBirth(){
        return Utilities.getDateOfBirth(this.age, 2023);
    }
}