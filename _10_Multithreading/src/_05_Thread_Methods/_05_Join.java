package _05_Thread_Methods;

class Greeting extends Thread
{
    public void run()
    {
        for (int i = 1;i<=3;i++)
        {
            try
            {
                Thread.sleep(1000);
                System.out.println("Good Morning");
//                Thread t1 = new Thread();
//                t1.join();

            }catch (InterruptedException e)
            {
                System.out.println("Something went wrong");
            }
        }
    }
}

public class _05_Join
{
    public static void main(String[] args) {
        /*
        Join method -> it allow to one thread wait until another thread is finished
        it is non-static method
         */

        System.out.println("Start execution");

        Greeting g1 = new Greeting();
        g1.start();

        try
        {
            g1.join(); // it will pause the main method
        }catch (Exception e)
        {
            System.out.println("Exception occur in join");
        }



        System.out.println("Main thread is running");
        System.out.println("Bye");

    }
}
