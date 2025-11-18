package _11_Association_in_java._02_has_a_relation;

class Engine{
    void Start()
    {
        System.out.println("Engine started");
    }
}

class Car
{
    Engine e1 = new Engine();
    void flex()
    {
        System.out.println("Car have beauty");
    }
}

public class Demo
{
    public static void main(String[] args) {
        /*
        Has a relation provide the  loose coupling the child class can access which method he want to call by using association
         */

        Car c1 = new Car();
        c1.e1.Start(); // he can call the parent class method by the parent class object reference variable
        c1.flex();
    }
}
