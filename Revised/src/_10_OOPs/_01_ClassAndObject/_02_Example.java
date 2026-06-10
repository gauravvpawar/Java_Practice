package _10_OOPs._01_ClassAndObject;

// define the demo example of real world
class Employee
{
    // this define states
    int empId;
    String name;
    String group;

    // to define the behaviour of class
    void printDetails()
    {
        System.out.println("my name :" + name + " I am from " + group);
    }

    void printGroup()
    {
        System.out.println("my group is : " + group);
    }

    void printId()
    {
        System.out.println("Hello my name is : " + name +" and my employee id : " + empId);
    }

}


public class _02_Example
{
    public static void main(String[] args)
    {
        // to define the object
        Employee e1 = new Employee();
        e1.empId = 112233;
        e1.group = "Developer Group";
        e1.name = "Gaurav";

        // to access details
        e1.printDetails();

        e1.printId();
    }
}
