package _10_OOPs._04_Abstraction;

// abstract class
// abstract class through we can achieve  0 - 100 % abstraction in programming
// if one of the method is just declare in class we have to provide the abstract keyword for class
// if the method is abstract then we also have to provide the abstract keyword for class as well

abstract class Vehicle
{
    abstract void start();

    void stop()
    {
        System.out.println("Vehicle Stop");
    }
}

class Car extends Vehicle
{
    void start()
    {
        System.out.println("Car start with key and start button");
    }
}

class Bike extends Vehicle
{
    void start()
    {
        System.out.println("Bike start with self start");
    }
}

public class _04_AbstractClass
{
    public static void main(String[] args) {
        // you can not create the object of abstract class
        // Vehicle v1 =  new Vehicle() {
        // } // you have to provide the body of the declare method while creating

        Car c = new Car();
        c.start();
        c.stop();

        Bike b = new Bike();
        b.start();
        b.stop();
    }
}
