package _12_MultiThreading._04_Thread_Methods;

class Calie extends Thread
{
    public void run()
    {
        for(int i = 1;i<=3;i++)
        {
            try
            {
                System.out.println("Number Action : " + i);
                Thread.sleep(1000);
            }catch (Exception e)
            {
                System.out.println("Thread interrupt");
            }
        }
    }
}

public class _04_Interrupt
{
    public static void main(String[] args) {
        /*
        Interrupt method it used for to request the current execution thread stop or not by sleep or join
         */

        Calie c1 = new Calie();
        c1.start();

        c1.interrupt(); //  it does not stop the execution
    }
}
