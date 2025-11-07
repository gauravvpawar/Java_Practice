package Practice;

// take three input from user and print the which one is largest one

import java.util.Scanner;

public class _01_Find_Largest_one
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();

        System.out.println("Enter the  second number : ");
        int b = sc.nextInt();

        System.out.println("Enter the third number");
        int c = sc.nextInt();

        if(a> b && a > c)
        {
            System.out.println("first is greater one");
        }else if(b > a && b > c)
        {
            System.out.println("second number is greater");
        }else{
            System.out.println("Third number is greater");
        }
    }
}
