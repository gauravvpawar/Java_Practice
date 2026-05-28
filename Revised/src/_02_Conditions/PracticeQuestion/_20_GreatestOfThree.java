package _02_Conditions.PracticeQuestion;

import java.util.Scanner;

// take three input from user and find the largest one
public class _20_GreatestOfThree
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();

        System.out.println("Enter the second number : ");
        int b = sc.nextInt();

        System.out.println("Enter the third number : ");
        int c = sc.nextInt();

        if(a > b && a > c)
        {
            System.out.println("number first is greater");
        }else if(b > a && b > c)
        {
            System.out.println("Second number is greater");
        }else{
            System.out.println("Third number is greater");
        }
    }
}
