package Practice_Question;

//Write a program to print the factorial of a number by defining a method named 'Factorial'
// . Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *

import java.util.Scanner;

public class _09_Find_Factorial
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("Factorial : " + find_Factorial(num));
    }

    public static int find_Factorial(int num)
    {
        int fact = 1;
        for(int i = 1;i<=num;i++)
        {
            fact = fact * i;
        }

        return fact;
    }
}
