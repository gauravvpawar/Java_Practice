package _11_Association_in_java._01_Is_a_relation;

class Animal
{
    void eat()
    {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog bark");
    }
}

public class Demo
{
    public static void main(String[] args) {
        /*
        Is a relation in that provide the tight coupling of the  classes
        like dog class extend animal it dog allow to use itself property and parent property

         */

        Dog d1 = new Dog();
        d1.eat();
        d1.bark();
    }
}
