package _03_Loops.PracticeQuestion;

import java.util.Scanner;

// write the code that return the reverse of it original number
public class _04_ReverseOfNum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int rev = 0;
        while (num > 0)
        {
            int rem = num%10;
            rev = rev * 10 + rem;
            num /= 10;
        }

        System.out.println("Reverse Number : " + rev);
    }
}
