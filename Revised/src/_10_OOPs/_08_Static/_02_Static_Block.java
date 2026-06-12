package _10_OOPs._08_Static;

// static block is always execute once when the object is created

class Demo
{
    static {
        System.out.println("It always execute once when class load");
        // fun(); while calling the non static method in static we have to create object of that
        Demo d = new Demo();
        d.fun();
    }

    void fun()
    {
        System.out.println("Inside fun");
    }
}

public class _02_Static_Block
{
    public static void main(String[] args) {
        Demo d1 = new Demo();

        Demo d2 = new Demo(); // it can not execute twice
    }
}
