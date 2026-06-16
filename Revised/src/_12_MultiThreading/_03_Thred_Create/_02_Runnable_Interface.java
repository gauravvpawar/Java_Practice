package _12_MultiThreading._03_Thred_Create;

// when we are using runnable interface we always have to implement his abstract method
class Car implements Runnable
{
    public void run()
    {
        System.out.println("------------------------------------inside car--------------------------------------------");
        System.out.println("Inside car");
        for(int i = 0;i<5;i++)
        {
            System.out.println("hello passenger can seat : " + i);
        }

        System.out.println("-----------------------------------end car------------------------------------------");
    }
}

class Table implements Runnable
{
    public void run()
    {
        System.out.println("------------------------------- inside table -------------------------------------");
        for(int i = 1;i<=20;i++)
        {
            System.out.println("20 X " + i + " : " + (20*i) );
        }

        System.out.println("---------------------------------end table ------------------------------------");
    }
}

public class _02_Runnable_Interface
{
    public static void main(String[] args) {
        // when we use runnable interface we always have to create the object of thread to start the program
        // for achieving multithreading

        Table t = new Table();
        Car c = new Car();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();
    }
}
