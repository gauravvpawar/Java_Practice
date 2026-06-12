package _10_OOPs._08_Static;

class Car
{
    int numberOfTyre = 4;

    static String fuelType = "Petrol";

    static void printInfo()
    {
       // System.out.println("car have " + numberOfTyre); // you can not access non-static variable inside static
        // we have to create object of that first
        Car c = new Car();
        System.out.println(c.numberOfTyre);
    }

    void printType()
    {
        System.out.println("fuelType" + fuelType); // in static value we can access in non-static coz we have
        // to create object first to access this value
    }
}

public class _04_Notes
{
    public static void main(String[] args) {
    Car c = new Car();
    c.printType();

    c.printInfo();

    }
}
