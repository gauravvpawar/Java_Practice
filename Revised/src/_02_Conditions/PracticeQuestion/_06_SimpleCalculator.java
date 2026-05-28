package _02_Conditions.PracticeQuestion;

import java.util.Scanner;

// take input two number and arithmetic operator
public class _06_SimpleCalculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        System.out.println("Enter the arithmetic operator : ");
        char action = sc.next().trim().charAt(0);

        switch (action)
        {
            case '+':
                System.out.println("Addition : " + (num1 + num2));
                break;

            case '-':
                System.out.println("Subtraction : " + (num1 - num2));
                break;

            case '*':
                System.out.println("Multiplication : " + (num1 * num2));
                break;

            case '/':
                System.out.println("Division : " + (num1 / num2));
                break;

            case '%':
                System.out.println("Modulo : " + (num1 % num2));
                break;

            default:
                System.out.println("Invalid action");
        }
    }
}
