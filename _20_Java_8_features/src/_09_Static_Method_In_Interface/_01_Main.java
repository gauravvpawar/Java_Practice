package _09_Static_Method_In_Interface;

interface Vehicle
{
    static void inf()
    {
        System.out.println("inside vehicle");
    }

    static void work()
    {
        System.out.println("it used for the driving purpose");
    }
}

public class _01_Main
{
    public static void main(String[] args) {
        // after java 8 you can call the static method from interface without creating the object of interface
        Vehicle.inf();
        Vehicle.work();// we can called method directly

    }
}
