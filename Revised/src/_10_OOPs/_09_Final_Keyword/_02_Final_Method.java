package _10_OOPs._09_Final_Keyword;

// in inheritance if we declare method as final then we can not override it
// you can not change the definition of final method

class Parent
{
    final void printProperty()
    {
        System.out.println("Parent has its own house");
    }
}

class Child extends Parent
{
    // if child class want to change the definition of parent class you can not
    //void printProperty()
    //{}
}
public class _02_Final_Method
{
    public static void main(String[] args) {

    }
}
