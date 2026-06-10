package _10_OOPs._02_Constructor;

// default constructor
// when you do not pass any parameter inside the value while object creation is called the default constructor called

class Student
{
    int age;
    String name;

    Student()
    {
        System.out.println("Automatically call every time when you object is creating");
        age = 20;
        name = "Radhe";
    }

    void printInfo()
    {
        System.out.println("name : " + name + " age : " + age);
    }

}

public class _02_DefaultConstructor
{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printInfo();

        Student s2 = new Student();
        s2.printInfo();
    }
}
