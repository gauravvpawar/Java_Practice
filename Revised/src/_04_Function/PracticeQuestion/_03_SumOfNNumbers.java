package _04_Function.PracticeQuestion;

import java.util.Scanner;

// write the program that return the sum of n natural number
public class _03_SumOfNNumbers
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("Sum of n numbers : " + findSum(num));
    }

    public static int findSum(int num)
    {
        int sum = 0;
        for(int i = 1;i<=num;i++)
        {
            sum = sum + i;
        }
        return sum;
    }
}
