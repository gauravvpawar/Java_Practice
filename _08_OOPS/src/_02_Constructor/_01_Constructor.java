package _02_Constructor;

class Person{
    int age;
    String name;


    Person()
    {
        System.out.println("It called");
        age  = 25;
        name = "Gaurav";
    }


}

public class _01_Constructor
{
    public static void main(String[] args) {
        /*
            constructor -> constructor is use for the  initialise the object
            constructor dont have any return type it you provide explicit it work like method
            constructor is same like method which has name its own class
            constructor have three type ->
            default constructor -> it automatically called when the object is created
            parameterised constructor -> to initialise the value of object
            copy constructor -> it same like constructor which initialise value from another object
         */

        /*
        Person p1 = new Person();
        p1.age = 25;
        p1.name = "Gaurav"
         it works but it looks more complex code and show redundancy
         */
        Person p1 = new Person();

        System.out.println(p1.name);
        System.out.println(p1.age);
    }
}
