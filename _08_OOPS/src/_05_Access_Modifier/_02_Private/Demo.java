package _05_Access_Modifier._02_Private;

class Car
{
    private void fun()
    {
        System.out.println("Car started");
    }
}

class Bmw extends Car
{
    /*
    Car c1 = new Car();
    c1.fun();
    you cant access in child class also
     */
}

public class Demo
{
    public static void main(String[] args) {
        /*
        you can access in outside class
         */

        Car car = new Car();
//        car.fun();
    }
}


