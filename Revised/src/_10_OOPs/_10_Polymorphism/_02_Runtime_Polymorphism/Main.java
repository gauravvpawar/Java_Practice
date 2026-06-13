package _10_OOPs._10_Polymorphism._02_Runtime_Polymorphism;

// runtime polymorphism
// it is part of inheritance
// you change the definition of parent class in child class
// you can not decrease the accessibility of method
// the data type must be same as the parent method
// you can not override the private method

class A
{
    private void demo()
    {
        System.out.println("hello  inside A");
    }

    void show()
    {
        System.out.println("Inside A");
    }
}

class B extends A
{
    // change the parent class definition
    void show()
    {
        System.out.println("Inside B");
    }

//    private void demo()
//    {
//        System.out.println("Hello Inside B");
//    }

}

public class Main
{
    public static void main(String[] args) {
        B b1 = new B();
        b1.show();

//        b1.demo(); // you can not access it
    }
}
