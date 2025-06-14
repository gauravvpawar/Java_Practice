package _01_Flow_OF_Program;

// take two number from the user input and print the sum of it

import  java.util.*;
public class _02_PrintSumOfTwo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b;
        System.out.println("Enter the first number : ");
        a = sc.nextInt();
        System.out.println("Enter the second number : ");
        b = sc.nextInt();

        System.out.println("Sum of two : " + (a + b));
    }
}
