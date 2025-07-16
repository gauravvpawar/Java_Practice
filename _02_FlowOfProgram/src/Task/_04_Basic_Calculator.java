package Task;

import java.util.Scanner;

public class _04_Basic_Calculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int firstNum = sc.nextInt();
        System.out.println("Enter the second number : ");
        int secondNum = sc.nextInt();

        System.out.println("Enter the operation you want to perform : ");
        char ch = sc.next().charAt(0);

        int ans = 0;
        switch (ch)
        {
            case '+' :
                ans = firstNum + secondNum;
                System.out.println("Sum : " + ans);
                break;

            case '-':
                ans = firstNum - secondNum;
                System.out.println("Subtraction : " + ans);
                break;

            case '*':
                ans = firstNum * secondNum;
                System.out.println("Multiplication : " + ans);
                break;

            case '/' :
                ans = firstNum / secondNum;
                System.out.println("Divisor : " + ans);
                break;

            default:
                System.out.println("you Entered invalid syntax ");
        }
    }
}
