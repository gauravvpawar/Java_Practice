package _02_Conditions;

import java.util.Scanner;

public class _01_Conditions
{
    public static void main(String[] args) {
//        condition is used for to check on particular
        // like check number is positive or negative
        // in that we have
        /*
            if condition
            if else
            else if ladder
            nested if else
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        if(num > 0)
        {
            System.out.println("Number is positive");
        }else{
            System.out.println("Number is negative");
        }
    }
}
