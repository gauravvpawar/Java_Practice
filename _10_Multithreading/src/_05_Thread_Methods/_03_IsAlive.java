package _05_Thread_Methods;

class Student extends Thread
{
    public void run()
    {
        for(int i = 1;i<=3;i++)
        {
            System.out.println("Hello Everyone ");
        }
    }
}

public class _03_IsAlive
{
    public static void main(String[] args) {
        /*
        is alive check the given thread is in work or not
         */

        Student s1 = new Student();
        System.out.println(s1.isAlive()); // false
        s1.start();

        System.out.println(s1.isAlive());//true
        System.out.println("Bye");

    }
}
