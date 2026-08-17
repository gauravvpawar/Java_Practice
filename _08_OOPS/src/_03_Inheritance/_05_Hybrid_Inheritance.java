package _03_Inheritance;

class Vehicle
{
    void run()
    {
        System.out.println("Vehicle can run from one place to another");
    }
}

class Bike extends Vehicle
{
    void start()
    {
        System.out.println("start by using kick");
    }
}

class Car extends Vehicle
{
    void start()
    {
        System.out.println("Start by using car key");
    }
}

class SportsCar extends Car
{
    void work()
    {
        System.out.println("Use on special track");
    }
}
public class _05_Hybrid_Inheritance
{
    public static void main(String[] args) {
        /*
           - Java does not support Hybrid inheritance
           -- we can support the hybrid by using single and multilevel with the help of hierarchical inheritance
           - java do not allow one class have multiple parent due to ambiguity problem
           - hybrid is the combination of two type or more type of inheritance
         */

        Car c1 = new Car();
        c1.start();

        Bike b1 = new Bike();
        b1.start();

        SportsCar sp = new SportsCar();
        sp.start();
        sp.work();
    }
}
