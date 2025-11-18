package _09_Polymorphism;

class Human
{
    void Population()
    {
        System.out.println("Human population is 7 Billion");
    }
}

class Person extends Human
{
    void Population()
    {
        System.out.println("he is the part of population");
    }
}

public class _02_Method_Override
{
    public static void main(String[] args) {
        /*
        Method override it occur in the inheritance when child class want to change the definition of parent method
        that time we can use method override
        it have same method name , parameter and access modifier
         */
        Person p1 = new Person();
        p1.Population();


    }
}
