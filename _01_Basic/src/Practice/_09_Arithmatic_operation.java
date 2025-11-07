package Practice;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class _09_Arithmatic_operation
{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();

        System.out.println("Enter the operation you want to perform( + , - , *  , /)");
        char act = sc.next().charAt(0);

        if(act == '+')
        {
            System.out.println(a+b);
        }else if(act == '-')
        {
            System.out.println(a - b);
        }else if(act == '*')
        {
            System.out.println(a * b);
        }else if(act == '/')
        {
            System.out.println(a /b);
        }else{
            System.out.println(a%b);
        }

    }
}
