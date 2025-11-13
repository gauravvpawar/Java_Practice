package _03_Inheritance;

class Dog
{
    void run()
    {
        System.out.println("Inside run");
    }
}

class Cat extends Dog
{
    void hunt()
    {
        System.out.println("Inside hunt");
    }
}

class Mouse extends Cat
{
    void eat()
    {
        System.out.println("Inside eat");
    }
}
public class _03_Multi_level_inheritance
{
    public static void main(String[] args) {
        /*
         Multilevel inheritance it have base class extend property of child class and  base class also become derived class
         it also extended by another child class
         */

        Mouse m1 = new Mouse();
        m1.eat();
        m1.hunt();
        m1.run();

        Cat c1 = new Cat();
        c1.hunt();
        c1.hunt();


    }
}
