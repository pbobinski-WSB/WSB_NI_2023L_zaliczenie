public class Motorbike extends Vehicle
{
    public Motorbike(String name, String color)
    {
        super(name, color);
    }

    @Override
    public void information()
    {
        System.out.println(name + " motorbike, color: " + color + ", 2 wheels");
    }
}