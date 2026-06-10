package _10_OOPs._02_Constructor;

// Parameterised Constructor
// when you pass the value inside the parameter while object creation time

class Person
{
    int age;
    String name;

    Person(int num , String naam)
    {
        age = num;
        name = naam;
    }

    void printInfo()
    {
        System.out.println("name " + name );
        System.out.println("age " + age);
    }


}
public class _03_ParameterisedConstructor
{
    public static void main(String[] args) {
    Person p1 = new Person(22 , "Gaurav");
    p1.printInfo();
    }
}
