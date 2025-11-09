package Practice_Question;

//Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class _02_Even_Odd
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("Given number : " + check_number(num) );
    }

    public static String check_number(int num)
    {
        if(num % 2 == 0)
        {
            return "Even";
        }

        return "odd";
    }
}
