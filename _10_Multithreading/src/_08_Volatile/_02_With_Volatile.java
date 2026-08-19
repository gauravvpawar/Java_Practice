package _08_Volatile;

class Bank
{
    public static volatile boolean status = true;
}

class User extends Thread
{
    public void run()
    {
        while (Bank.status)
        {
            for(int i = 1;i<=100;i++)
            {
                System.out.println("bank working");
            }

            System.out.println("Bank Stopped working");
        }
    }
}

public class _02_With_Volatile
{
    public static void main(String[] args) throws InterruptedException {
        // volatile it used for to change the accessibility of variable in thread
        User u = new User();
        u.start();

        Thread.sleep(3000);
        Bank.status = false;
        System.out.println("program stopped");
    }
}
