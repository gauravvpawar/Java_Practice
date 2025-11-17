package _6_This_And_Super._01_This;

/*
    this refers to the current instance object
    it also use for the variable method and constructor
 */

class Student
{
    int age;
    String name;

    Student()
    {
        System.out.println("Inside default constructor");
    }

    Student(String name , int age)
    {
        // you can also called the  default constructor
        this();
        this.name = name;
        this.age = age;

        // it also refer the same block method
        show();
    }

    void show()
    {
        System.out.println(age + " " + name);
    }
}

public class Demo
{
    public static void main(String[] args) {
//        Student s1 = new Student();

        Student s2 = new Student("Gaurav" ,22);

        System.out.println("---------------------------");
        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}
