public class Main {
    public static void main(String[] args) {
        System.out.println("------------- ABSTRACT CLASS VEHICLE ---------------");

        Vehicle car = new Car("Honda", "Red");
        Vehicle motorbike = new Motorbike("Kawasaki", "Black");
        Vehicle truck = new Truck("Scania", "White");

        car.information();
        motorbike.information();
        truck.information();
    }
}







