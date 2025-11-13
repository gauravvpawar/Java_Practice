package _03_Inheritance;

class Parent
{
    void Property()
    {
        System.out.println("Inside parent");
    }
}

class Children extends Parent
{
    void living()
    {
        System.out.println("Inside child");
    }
}

public class _02_Single_Inheritance
{
    public static void main(String[] args) {
        /*
            Single inheritance -> it is a is a relation
                it have only one  derived class and one base class
         */

        Children ch = new Children();
        ch.Property(); // he can able to use all parent property
        ch.living();
    }
}
