package _12_MultiThreading._03_Thred_Create;

import java.util.Scanner;

class Wishes extends Thread
{
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.next();

        System.out.println("Welcome : " + name);
    }
}

class Addition extends Thread
{
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        System.out.println("Addition of number : " + (num1 + num2));
    }
}

public class _01_Thread_Class
{
    public static void main(String[] args) {
        // Multi threading we can achieve through thread class
        // as well as runnable interface

        // through multithreading, we can achieve the multiple thread execute at a single time
        Wishes w  = new Wishes();
        Addition a = new Addition();

        w.start();
        a.start();
    }
}
