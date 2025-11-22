package _06_Synchronized_used;

class Car implements Runnable
{
//    public synchronized  void run()
    public   void run()
    {
        try
        {
            System.out.println(Thread.currentThread().getName() + " enter the parking lot");
            Thread.sleep(3000);
            synchronized (this)
            {
                System.out.println(Thread.currentThread().getName() + "  get a keys");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + " Started a car and drive the car");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + " Came back and parked the car");
            }
        }catch (InterruptedException e)
        {
            System.out.println("Something went wrong");
        }


    }
}

public class Demo
{
    public static void main(String args[])
    {
        /*
        Synchronised keyword  used to when you have only one resource and multiple thread access that resource that time  it
        might occur the wrong output then you can define block as the synchronised when the one tread accessing that resource
        other in waiting list
         */

        Car c1 = new Car();
        Thread t1 = new Thread(c1);
        t1.setName("Person 1");
        Thread t2 = new Thread(c1);
        t2.setName("Person 2");
        Thread t3 = new Thread(c1);
        t3.setName("Person 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
