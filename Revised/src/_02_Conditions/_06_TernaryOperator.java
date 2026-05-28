package _02_Conditions;

import java.util.Scanner;

public class _06_TernaryOperator
{
    public static void main(String[] args) {
        // ternary Operator is precise code for the condition check it include
        // syntax  ( condition ) ? do this : or else do this

        // to check even or odd
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        String ans = num % 2 == 0 ? "Even" : "Odd";
        System.out.println("Given number is : " + ans);
    }
}
