public class Truck extends Vehicle
{
    public Truck(String name, String color)
    {
        super(name, color);
    }

    @Override
    public void information()
    {
        System.out.println(name + " truck, color: " + color + ", 6 wheels");
    }
}