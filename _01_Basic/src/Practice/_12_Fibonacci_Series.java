package Practice;

// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class _12_Fibonacci_Series
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int firstNum  = 0;
        int secondNum  = 1;

        System.out.print(firstNum +" " +  secondNum);

        for(int i  = 1;i<=n;i++)
        {
            int thirdNum = firstNum + secondNum;
            System.out.print(" " + thirdNum);
            firstNum = secondNum;
            secondNum = thirdNum;
        }
    }
}
