package _05_Thread_Methods;

class StudentCount extends Thread
{
    public void run()
    {
        for(int i = 1;i<=10;i++)
        {
            try
            {
                Thread.sleep(1000);
                System.out.println("Count student : " + i);
            }catch (Exception e)
            {
                System.out.println("Something went wrong");
            }
        }
    }
}

public class _01_Sleep
{
    public static void main(String[] args) {
        /*
         Sleep() method in thread is used to pause the current execution of thread for some time in milliseconds
         it is static method you can call method with class name
         It trows the interupt Exception when you call it compile time
         */

        StudentCount s1 = new StudentCount();
        s1.start();
    }
}
