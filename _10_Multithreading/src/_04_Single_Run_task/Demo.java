package _04_Single_Run_task;

import java.util.Scanner;

class Task extends Thread
{
    public void run()
    {
        String thread = Thread.currentThread().getName();
        if(thread.equals("calc"))
        {
            calc();
        }else {
            greeting();
        }
    }

    public void calc()
    {
        System.out.println("Perform calculation : ");
        System.out.println("Enter the first number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();

        System.out.println("Addition is : " +( a + b));
        System.out.println("Calculation ended");
    }

    public void greeting()
    {
        System.out.println("-----------------------------------Greeting started --------------------------------------");
        for(int i = 1;i<=10;i++)
        {
            System.out.println("Student count : " + i);
        }
        System.out.println("---------------------------------Greeting Ended");
    }
}

public class Demo
{
    public static void main(String[] args) {
        /*
        we can achieve the multiple task execute by using single run
         */

        Task t1 = new Task();
        t1.setName("calc");
        Task t2 = new Task();
        t2.setName("greet");

        t1.start();
        t2.start();
    }
}
