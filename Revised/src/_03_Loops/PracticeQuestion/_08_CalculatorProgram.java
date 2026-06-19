package _03_Loops.PracticeQuestion;

import java.util.Scanner;

// write the code that work like calculator
public class _08_CalculatorProgram
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        System.out.println("Enter the operation : ");
        char operator = sc.next().charAt(0);

        switch (operator)
        {
            case '+':
                System.out.println("Addition : " + (num1+num2));
                break;

            case '-':
                System.out.println("Subtraction : " +(num1 - num2));
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
                System.out.println("Invalid Character");
        }
    }
}
