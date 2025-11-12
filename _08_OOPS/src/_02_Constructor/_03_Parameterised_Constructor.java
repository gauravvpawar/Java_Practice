package _02_Constructor;

class Student{
    String name;
    int  age;
    int std_class;

    Student(String naam , int x , int standard)
    {
        name = naam;
        age = x;
        std_class = standard;
    }

    public void info()
    {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Standard : " + std_class);
    }
}

public class _03_Parameterised_Constructor
{
    public static void main(String[] args) {
        /*
        Parameterised constructor -->
            parameterised constructor it used to initialise value in object
            when you pass the value inside the parameter and initialise it
         */

        Student s1 = new Student("Rahul" , 20 , 10);
        /*
             instead of this
             s1.name = "Rahul"
             s1.x = 20;
             s1.standard = 10;
         */
        s1.info();
    }
}
