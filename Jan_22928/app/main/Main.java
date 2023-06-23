package app.main;

import app.model.Car;
import app.model.Person;

public class Main {
    public static void main(String[] args){
        Person person = new Person("Andrzej Głowica", 633123456, "12345678911", "Kwiatowa 12", 43);
        Car car = new Car(person,"toyota","corrola");
        System.out.println("Data urodzenia: ");
        System.out.println(person.getDateOfBirth());
        System.out.println("Model samochodu to: ");
        System.out.println(car.getMakeAndModel());
    }
}
