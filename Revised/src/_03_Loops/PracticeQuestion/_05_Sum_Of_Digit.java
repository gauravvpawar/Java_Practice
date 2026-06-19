package _03_Loops.PracticeQuestion;

import java.util.Scanner;

// write the code that find the sum of digit
public class _05_Sum_Of_Digit
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int sum = 0;
        while (num>0)
        {
            int rem = num % 10;
            sum = sum + rem;
            num /= 10;
        }

        System.out.println("Sum of  digit : " + sum);
    }
}
