package _04_Function.PracticeQuestion;

import java.util.Scanner;

public class _04_FindEvenOdd
{
    public static void main(String[] args) {
        // write the code that check give number even or odd
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("Given number is : "+checkNum(num));
    }

    public static String checkNum(int num)
    {
        if(num % 2 == 0)
        {
            return "Even";
        }

        return "Odd";
    }
}
