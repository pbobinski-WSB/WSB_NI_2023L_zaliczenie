public abstract class Vehicle
{
    String name;
    String color;

    public Vehicle(String name, String color)
    {
        this.name = name;
        this.color = color;
    }

    public abstract void information();
}
