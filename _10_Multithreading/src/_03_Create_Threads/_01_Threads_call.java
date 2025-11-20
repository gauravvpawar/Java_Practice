package _03_Create_Threads;

class Demo extends Thread
{
    public void run()
    {
        for(int i = 1;i<=10;i++)
        {
            System.out.println("Count started : "+ i);
        }
    }
}

public class _01_Threads_call
{
    public static void main(String[] args) {
        /*
        to achieve the multithreading by using the thread class and the runnable interface
         */

        Demo d1 = new Demo();
        Thread t1 = new Thread(d1);
        t1.start(); // it allowed by the thread schedular
    }
}
