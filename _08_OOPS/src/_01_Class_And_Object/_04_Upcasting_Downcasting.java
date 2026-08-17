package _01_Class_And_Object;

class Animal
{
    void run()
    {
        System.out.println("Animal can run");
    }
}

class Kangaroo extends Animal
{
    void run()
    {
        System.out.println("Kangaroo can only jump");
    }

    void feature()
    {
        System.out.println("They can only found in Australia");
    }
}


public class _04_Upcasting_Downcasting
{
    public static void main(String[] args) {
        // upcasting
        // upcasting means when you creating the object through the child class as the reference of parent class
        Kangaroo obj1 = new Kangaroo();
        obj1.feature();
        obj1.run();

        Animal obj2 = obj1;
        obj2.run(); // through this you can accessible the parent class methods only

        //down casting
        // in down casting while you creating the variable of parent class variable you can not access some property of
        // child class
        Animal obj3 = new Kangaroo();
        obj3.run();
//        obj3.feature();  // cant access this now
        Kangaroo k =(Kangaroo) obj3;
        k.feature(); // you have to explicitly type cast the with the child class
    }
}
