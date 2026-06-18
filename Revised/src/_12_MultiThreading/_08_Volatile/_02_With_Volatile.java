package _12_MultiThreading._08_Volatile;

// volatile it used for visibility changes of the variable in thread

class Bank
{
    static volatile boolean status = true;
}

class User extends Thread
{
    public void run()
    {
        while (Bank.status) {
            System.out.println("working ... ");
        }

        System.out.println("Thread Stopped");

    }
}

public class _02_With_Volatile
{
    public static void main(String[] args) throws InterruptedException
    {
        User u = new User();

        u.start();

        Thread.sleep(3000);
        Bank.status = false;
        System.out.println("Program ended");
    }
}
