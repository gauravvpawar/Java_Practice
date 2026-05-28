package _01_Basic.ParcticeQuestion;

import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if condition
public class _04_ArithmeticOperation
{
    public static void main(String[] args) {
        // to perform the arithmetic Operation
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        System.out.println("Enter the operator");
        String action = sc.next();
        char operator = action.charAt(0);

        if(operator == '+')
        {
            System.out.println(num1 + num2);
        }else if(operator == '-')
        {
            System.out.println(num1 - num2);
        }else if(operator == '*')
        {
            System.out.println(num1 * num2);
        }
        else if(operator == '/')
        {
            System.out.println(num1 / num2);
        }else if(operator == '%')
        {
            System.out.println(num1 % num2);
        }else{
            System.out.println("invalid operator");
        }
    }
}
