package _10_OOPs._03_Inheritance;

// In Single Inheritance
// in single inheritance is have only one parent class and one child class child class acquiring all properties of
// parent class
// it also called Is a relationship
// it have one parent(Derived class) class and one child class(base class)


class Parent{
    void haveProperty()
    {
        System.out.println("Parent have his own property");
    }

    void haveHouse()
    {
        System.out.println("Parent living in there own house");
    }
}

class Child extends Parent
{
    void haveWill()
    {
        System.out.println("Children living his own life");
    }
}

public class _01_SingleInheritance
{
    public static void main(String[] args) {
        Child c1 = new Child();

        // child object can access all the properties of parent class
        c1.haveWill();
        c1.haveHouse();
        c1.haveProperty();
    }

}
