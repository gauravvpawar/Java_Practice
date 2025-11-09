package Practice_Question;

//Write a program to print the sum of two numbers entered by user by defining your own method.

import java.util.Scanner;

public class _04_Operations
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a =  sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        Perform_Opt(a  , b);
    }

    public static void Perform_Opt(int x , int y)
    {
        System.out.println("Addition : " + (x +y));
        System.out.println("Subtraction : " + (x - y));
        System.out.println("Multiplication : " + (x * y));
        System.out.println("Division : " + (x/y));
    }
}
