package _12_MultiThreading._04_Thread_Methods;

class Demo extends Thread
{
    public void run()
    {
        for(int i = 0;i<=10;i++)
        {
            try
            {
                Thread.sleep(1000);
                System.out.println(i + " seconds completed");
            }catch (Exception e)
            {
                System.out.println("Exception occur");
            }
        }
    }
}

public class _01_Sleep
{
    public static void main(String[] args) {
        /*
        Sleep is used for the pause the current execution thread for some time
        sleep is static method in java it throws interrupt exception when you use it
         */

        // create the thread
        Demo d = new Demo();
        d.start();
    }
}
