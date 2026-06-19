package _03_Loops.PracticeQuestion;

// write the code tha find the factorial of the number

import java.util.Scanner;

public class _01_FactorialProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int fact = 1;
        for(int i = 1;i<=num;i++)
        {
            fact =  fact * i;
        }

        System.out.println("Factorial of Number : " + fact);
    }
}
