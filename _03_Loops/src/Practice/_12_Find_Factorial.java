package Practice;

// Factorial Program In Java

import java.util.Scanner;

public class _12_Find_Factorial
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number : ");
        int num = sc.nextInt();

        int fact = 1;
        for(int i = 1;i<=num;i++)
        {
            fact = fact * i;
        }

        System.out.println("Factorial of given number : " +fact);
    }
}
