package _03_Create_Threads;

import java.util.Scanner;

class Calcie extends Thread
{
    public void run()
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
}

class Message extends Thread
{
    public void run()
    {
        for(int i = 1;i<=10;i++)
        {
            System.out.println("Calculation started : " + i);
        }
    }
}

public class _02_By_Extends_Thread
{
    public static void main(String[] args) {
        // by the thread you can directly call the method
        Calcie c1 = new Calcie();
        Message m1 = new Message();
        c1.start();
        m1.start();

/*
     if you call m1.run() it can perform as a single thread you cant achieve multithreading
 */
    }
}
