package Practice;

//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

public class _05_FindCalculation
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        System.out.println("Enter the number : ");
        String num = sc.next();

        while (!num.equals("x"))
        {

            sum = sum + Integer.parseInt(num);
            num = sc.next();
        }


        System.out.println("Sum : " + sum);
    }
}
