package _03_Loops.PracticeQuestion;

import java.util.Scanner;

public class _06_CountDigit
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int count = 0;
        while (num > 0)
        {
            int rem = num%10;

            if(rem >0)
            {
                count++;
            }

            num /= 10;
        }

        System.out.println("Count : " + count);
    }
}
