

class Student<t>
{
    Student(t obj)
    {
        System.out.println("We are welcome to : " + obj.getClass().getName());
    }
}

public class Demo
{
    public static void main(String[] args) {
        /*
        Generics - that allows to code that works on different data type using class , method or interface
        we can create generics like <t> that works on different data
        we can achieve generics through class and method
         */

        Student s1 = new Student("Gaurav"); // string

        Student s2 = new Student(20); // integer



    }
}
