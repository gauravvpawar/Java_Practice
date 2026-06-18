package _12_MultiThreading._08_Volatile;

// volatile used in multithreading for ensure visibility changes across thread

class SharedData
{
    static boolean status = true;
}

class MyThread extends Thread
{
    public void run()
    {
        while(SharedData.status)
        {
            for(int i = 1;i<=5;i++)
            {
                System.out.println("working : " + i);
            }
        }
        System.out.println("thread stopped");
    }
}

public class _01_WithOut_Volatile {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        m1.start();

        SharedData.status = false; // if the status is not volatile it wont work the Shared.status block
        System.out.println("Program ended");
    }
}

//output
//thread stopped
//Program ended