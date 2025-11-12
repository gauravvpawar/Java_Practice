package _01_Class_And_Object;


class Person
{
    int age;
    String name;
    String car_name;
    String House;

    void run()
    {
        System.out.println("he must have good health and family");
    }

    void Info()
    {
        System.out.println("his name " + name + " and age " + age);
    }

    void Car()
    {
        System.out.println("He have car name : " + car_name);
    }

    void staying()
    {
        System.out.println("He is staying in " + House);
    }
}

public class _02_Person_Dreams
{
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "xyz";
        p1.age = 30;
        p1.House = "Excellent house";
        p1.car_name = "BMW Car";

        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.House);
        System.out.println(p1.car_name);

        p1.Info();
        p1.run();
        p1.staying();
        p1.Car();
    }
}
