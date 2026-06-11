package _10_OOPs._03_Inheritance;

// in multilevel Inheritance
// in multilevel in that All parent class property acquiring in child class and child class is also become derived class
// of another base class

// e.g person also become employee also he becomes manager

class Person
{
    String name = "gaurav";

    void  showPerson()
    {
        System.out.println("Name : " + name);
    }
}

class Employee extends Person
{
    int Emp_id = 112233;

    void showDetails()
    {
        System.out.println("he is " + name  + " and his id : " + Emp_id);
    }
}

class Manager extends Employee
{
    String department = "Developer";

    void showInfo()
    {
        System.out.println("name : " +name);
        System.out.println("Employee id : " + Emp_id);
        System.out.println("Department : " + department);
    }
}

public class _02_Multi_Level_Inheritance
{
    public static void main(String[] args) {

        Manager m1 = new Manager();
        m1.showInfo(); //  from manager class

        m1.showPerson();// from employee class

        m1.showDetails();// from Person class
    }
}
