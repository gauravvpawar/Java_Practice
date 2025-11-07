package Practice;

import java.util.Scanner;
//Write a program to print whether a number is even or odd, also take input from the user.

public class _06_CheckEvenOdd
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        if(num % 2 == 0)
        {
            System.out.println("Given number is even");
        }else{
            System.out.println("Given number is odd");
        }
    }
}
