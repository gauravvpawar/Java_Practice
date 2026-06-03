package _04_Function.PracticeQuestion;

import java.util.Scanner;

// write the program that check the given number is palindrome or not
public class _11_PalindromeCheck
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("Given number is Palindrome : "+ checkPalindrome(num));
    }

    public static boolean checkPalindrome(int num)
    {
        int temp = num;
        int rev = 0;
        while (temp>0)
        {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }

        return num == rev;
    }
}
