package Practice;

import java.util.Scanner;

public class _02_Calculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opinion;
        do {
            System.out.println("Enter the first number : ");
            int a = sc.nextInt();
            System.out.println("Enter the second number : ");
            int b = sc.nextInt();

            System.out.println("Enter the operation you want to perform : ");
            char ch = sc.next().charAt(0);

            if(ch == '+')
            {
                System.out.println("Your addition : " + (a+b));
            }else if(ch == '-')
            {
                System.out.println("Your subtraction : " + (a-b));
            }else if(ch == '*')
            {
                System.out.println("Your multiplication : " + (a*b));
            }else if(ch == '/')
            {
                if(b != 0)
                {
                    System.out.println("Your division : "+ (a / b));
                }else {
                    System.out.println("Number cant be divisible by zero");
                }
            }else if(ch  == '%')
            {
                System.out.println("Your remainder : " + (a% b));
            }else{
                System.out.println("Cannot recognise");
            }

            System.out.println("Enter Yes is want to continue");
            opinion = sc.next();
        }while (opinion.equals("Yes"));

        System.out.println("Visit again !");
    }
}
