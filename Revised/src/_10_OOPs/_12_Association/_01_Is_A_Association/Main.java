package _10_OOPs._12_Association._01_Is_A_Association;

// IS A Association
// it also called inheritance
// it provides tight coupling
// to access all the properties of parent class in child class
// there is no avoidance to not accept some data from parent class in inheritance

class Vehicle
{
    void start()
    {
        System.out.println("Start as per requirement");
    }
}
class Bike extends Vehicle
{
    void start()
    {
        System.out.println("Bike start through the key");
    }
}

public class Main
{
    public static void main(String[] args) {

    }
}
