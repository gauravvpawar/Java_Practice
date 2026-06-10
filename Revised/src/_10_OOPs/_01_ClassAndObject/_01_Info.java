package _10_OOPs._01_ClassAndObject;

// class
// class is the logical entity of the object
// class does not occupy any memory
// class contain states and behaviour
// class is just template
class Person
{
    // this is states of class
    String population = "7Billion";
    String name;

    // this is define the behaviour of class
    void printName()
    {
        System.out.println("my name is : " + name);
    }

    void printPopulation()
    {
        System.out.println("Population of world : " + population);
    }
}


public class _01_Info
{
    public static void main(String[] args) {
        // object
        // object is a real world entity of object
        // object occupy the memory
        // object is the instance of the class

        // to create the object
        Person p1 = new Person();
        p1.name = "gaurav";
        p1.printName();
        p1.printPopulation();
    }
}
