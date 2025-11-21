package _05_Thread_Methods;

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
                System.out.println("Something went wrong");
            }
        }
    }
}

public class _04_Interrupt
{
    public static void main(String[] args) {
        /*
        Interrupt method  is used to check the given thread is interrupt or not by the sleep , join
         */
        Calie c1 = new Calie();

        c1.start();
        c1.interrupt();
//        System.out.println();
    }
}
