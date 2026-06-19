package _03_Loops.PracticeQuestion;

import java.util.Scanner;

// write the program that check the given number is palindrome or not
public class _07_CheckPalindrome
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  : ");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;

        while (temp>0)
        {
            int rem = temp%10;
            rev = rev * 10 + rem;

            temp /= 10;
        }

        if(num == rev)
        {
            System.out.println("Given number is palindrome");
        }else {
            System.out.println("Given number is not palindrome");
        }
    }
}
