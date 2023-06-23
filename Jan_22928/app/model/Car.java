package app.model;

public class Car {
    private Person owner;
    private String make;
    private String model;

    public Car(Person owner, String make, String model){
        this.owner = owner;
        this.make = make;
        this.model = model;
    }

    /**
     * Metoda zwraca właściciela pojazdu
     * @return właściciel pojazdu
     */
    public Person getOwner(){
        return this.owner;
    }

    /**
     * Metoda zwraca sformatowana nazwe i model pojazdu 
     * @return połączenie marki i modelu przykład: "Volkswagen Passat"
     */
    public String getMakeAndModel(){
        return this.make+" "+this.model;
    }

}
