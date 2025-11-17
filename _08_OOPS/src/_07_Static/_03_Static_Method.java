package _07_Static;

class Car
{
    static void fun()
    {
        System.out.println("Inside fun");
        //you cant call the non static block inside the  class
//        show(); you have to first create the object of it
    }

    void show()
    {
        System.out.println("Inside show");
        fun(); // you can call the static block
    }
}

public class _03_Static_Method
{
    public static void main(String[] args) {
//        you can directly access the static block with his class name
        Car.fun();

        Car c1 = new Car();
        c1.show();
        c1.fun();
    }
}
