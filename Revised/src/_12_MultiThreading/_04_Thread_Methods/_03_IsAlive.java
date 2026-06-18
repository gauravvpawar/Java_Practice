package _12_MultiThreading._04_Thread_Methods;

class Test extends Thread
{
    public void run()
    {
        for(int i = 1;i<=5;i++)
        {
            try
            {
                Thread.sleep(1000);
                System.out.println(" Iteration : " + i);
            }catch (Exception e)
            {
                System.out.println("Exception occur");
            }
        }
    }
}

public class _03_IsAlive
{
    public static void main(String[] args) {
        /*
        is Alive check the current thread is working or not
         */

        Test t1 = new Test();
        System.out.println(t1.isAlive());// false
        t1.start();

        System.out.println(t1.isAlive()); // true
        System.out.println("Done !");
    }
}
