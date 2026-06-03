package _04_Function.PracticeQuestion;

import java.util.Scanner;

// write the method that return the product of the two number
public class _08_FindProduct
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        System.out.println("Multiplication : " + product(num1 , num2));
    }

    public static int product(int a , int b)
    {
        return a * b;
    }
}
