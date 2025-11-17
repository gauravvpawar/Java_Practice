package _07_Static;


/*
 Static is mostly use for the memery management
 */

// we have class student have all student belong to that the same college so instead of memory consume we
// can  define one variable as constant it can it created at once

class Student
{
    static String scname = "MIT";
    static int count = 0;
    String sname;
    int sage;

    Student(String name , int  age)
    {
        sname = name;
        sage = age;

        count++;
    }

    void showCount()
    {
        System.out.println(count);
    }

}

public class Demo
{
    public static void main(String[] args) {
        Student s1 = new Student("Gaurav" , 22);
        s1.showCount();
        System.out.println(s1.scname); // static variable does not belong to class
        System.out.println(Student.scname);

        Student.scname = "MARATHWADA INSTITUTE OF TECHNOLOGY"; // static variable value it is reinitializable
        System.out.println(Student.scname);

        Student s2 = new Student("Nitin" ,25);
        s2.showCount();
    }
}
