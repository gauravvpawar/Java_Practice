package _03_Loops.PracticeQuestion;

import java.util.Scanner;

public class _03_NumberOfOccurrence
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int count = 0;
        System.out.println("Enter the target number : ");
        int target = sc.nextInt();

        while (num > 0)
        {
            int rem = num % 10;
            if(rem == target)
            {
                count++;
            }

            num /= 10;
        }

        System.out.println("The target number Occurrence in given number : " + count);
    }
}
