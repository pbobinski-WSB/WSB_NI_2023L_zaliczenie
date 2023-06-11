public class Car extends Vehicle
{
    public Car(String name, String color)
    {
        super(name, color);
    }

    @Override
    public void information()
    {
        System.out.println(name + " car, color: " + color + ", 4 wheels");
    }
}
