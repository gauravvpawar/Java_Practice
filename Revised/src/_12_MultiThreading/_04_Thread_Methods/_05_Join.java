package _12_MultiThreading._04_Thread_Methods;

class Wishes extends Thread
{
    public void run()
    {
        for(int i=1;i<=3;i++) {

            System.out.println(i);
        }
    }
}

public class _05_Join
{
    public static void main(String[] args) {
        /*
        Join it used for make thread wait until the another thread finish
         */

        System.out.println("Execution started");

        Wishes w = new Wishes();
        w.start();

        try
        {
            w.join(); // it gives a chance to another thread to finish
        }catch (Exception e)
        {
            System.out.println("Exception occur");
        }

        System.out.println("main thread is running");
        System.out.println("End");
    }
}
