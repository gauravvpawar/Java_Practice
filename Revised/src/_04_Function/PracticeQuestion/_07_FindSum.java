package _04_Function.PracticeQuestion;

// write the method that return the sum of two numbers

import java.util.Scanner;

public class _07_FindSum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        System.out.println("Addition : " + add(num1 , num2));
    }

    public static int add(int a , int b)
    {
        return a + b;
    }
}
