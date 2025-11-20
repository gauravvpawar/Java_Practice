package _01_Single_Thread;

import java.util.Scanner;

public class Demo
{
    public static void main(String[] args) {
        /*
        The java execution of main thread by default single thread
        all code execute line by line
        the while you have to achieve multithreading in your code the by use the thread class and runnable interface
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculation started : ");
        System.out.println("Enter the first number : ");
        int x = sc.nextInt();

        System.out.println("Enter the second number : ");
        int y = sc.nextInt();

        System.out.println("Addition of numbers : " + (x + y));

        System.out.println("Calculation ended");

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Iteration start  : ");
        for(int i = 0;i<5;i++)
        {
            System.out.println("Count player :  " + i);
        }
        System.out.println("Iteration end");
        System.out.println("--------------------------------------------------------------------------------------------");


    }
}
