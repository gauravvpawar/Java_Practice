package _03_Inheritance;

class A{
    void run()
    {
        System.out.println("Inside a");
    }
}

class B extends A
{
    void fun()
    {
        System.out.println("Inside fun");
    }
}

public class _01_Inheritance
{
    public static void main(String[] args) {
        /*
            Inheritance is a to access the  parent  class property within child class that time we can use inheritance
            it allow to use all state and behaviour from the parent class by using extends keyword
            it also known as is a relation  or blood relation

            disadvantage ->
                it provide the tight coupling between two classes
         */

        B b1 = new B();
        b1.fun();
        b1.run();

        A a1 = new B();
        a1.run();// while you creating child class object with parent class reference you cant access base class method
//        a1.fun();

        /*
        types of inheritance -> 1- Single inheritance
                                2 - Multi level Inheritance
                                3 - Hierarchical inheritance
                                4 - Multiple inheritance ( java cant support due to ambiguity problem
                                5 - Hybrid  inheritance ( java cant support)
         */
    }
}
