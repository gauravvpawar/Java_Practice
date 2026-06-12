package _10_OOPs._07_Super_Keyword;

// in super method it call the parent method in child method

class Human
{
    String population = "7Billion";

    void info()
    {
        System.out.println("Living there life");
    }
}

class Person extends Human
{
    int age;
    String name;

    void info()
    {
        super.info(); // it called the parent method first
        System.out.println("name : " + name);
        System.out.println("age : " + age);
    }
}

public class _02_Super_Method
{
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Alexa";
        p1.age = 2;

        p1.info();
    }
}
