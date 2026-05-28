package _02_Conditions.PracticeQuestion;

import java.util.Scanner;

// find the largest number of given two
public class _05_GreatestOfTwo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        if(num1 > num2)
        {
            System.out.println("First number is greater");
        }else{
            System.out.println("Second number is greater");
        }
    }
}
