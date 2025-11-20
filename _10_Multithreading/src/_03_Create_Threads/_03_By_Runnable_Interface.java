package _03_Create_Threads;

import java.util.Scanner;

class College implements Runnable
{
    public void run()
    {
        System.out.println("-------------------------------------------College start----------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.next();
        System.out.println("Enter your age : " );
        int age = sc.nextInt();

        System.out.println("New admission : " + name + " " + age);
    }
}

class Greeting implements Runnable
{
    public void run()
    {
        System.out.println("-----------------------------------Greeting started --------------------------------------");
        for(int i = 1;i<=10;i++)
        {
            System.out.println("Student count : " + i);
        }
        System.out.println("---------------------------------Greeting Ended");
    }
}
public class _03_By_Runnable_Interface
{
    public static void main(String[] args) {
        /*
         by the runnable interface you can also achieve the multithreading
         but you cant call the thread directly
         you first have to create object of thread class and call the start method
         */

        College c1 = new College();
        Greeting g1 = new Greeting();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(g1);

        t1.start();
        t2.start();
    }
}
