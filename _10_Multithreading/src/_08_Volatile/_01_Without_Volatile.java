package _08_Volatile;

class SharedData
{
    public static boolean status = true;
}

class MyThread extends Thread
{
    public void run()
    {
        while (SharedData.status)
        {
            for(int i = 0;i<100;i++)
            {
                System.out.println("working..");
            }
        }
        System.out.println("Thread stopped");
    }
}


public class _01_Without_Volatile
{
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();

        SharedData.status = false;
        System.out.println("Program Ended");
    }
}
