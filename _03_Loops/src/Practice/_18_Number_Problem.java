package Practice;

// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of
// positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;
public class _18_Number_Problem
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        do{
            System.out.println("Enter the number : ");
            num = sc.nextInt();

            sum += num;
        }while (num != 0);

        System.out.println("Sum of all number : " + sum);
    }
}
