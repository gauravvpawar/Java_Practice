package _01_Class_And_Object;

/*
 class ->
    class is the logical entity of the object
    class is does not occupy the memory
    class is blue print of the object
 */


class Student
{
//    states of student
    int age;
    String name;


    // behaviour it means what he can do
    void run()
    {
        System.out.println("he can able to run");
    }

    void eat()
    {
        System.out.println("he can able to eat");
    }
}


public class _01_Class_Object_
{
    public static void main(String args[])
    {
        /*
         object ->
            object is  the real world entity
            - object does occupy the memory inside the heap
            object it contains state and behaviour
         */

        // s1 is the reference variable of the object

        Student s1 = new Student();
        System.out.println(s1.age);
        System.out.println(s1.name);

        // to initialise value of the object
        s1.age = 25;
        s1.name = "Gaurav";

        System.out.println(s1.age);
        System.out.println(s1.name);

        s1.run();
        s1.eat();

        // object creation inside the  memory ->
        new Student(); // it create


    }
}
