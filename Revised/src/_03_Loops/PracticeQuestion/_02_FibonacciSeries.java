package _03_Loops.PracticeQuestion;

import java.util.Scanner;

// write the code that find the fibonacci series
// 0 1 1 2 3 4
public class _02_FibonacciSeries
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int num1 = 0;
        int num2 = 1;

        System.out.print(num1 + " " + num2+" ");
        for(int i = 2;i<num;i++)
        {
            int num3 = num1 + num2;
            System.out.print(num3+" ");

            num1 = num2;
            num2 = num3;
        }

        System.out.println("end");
    }
}
