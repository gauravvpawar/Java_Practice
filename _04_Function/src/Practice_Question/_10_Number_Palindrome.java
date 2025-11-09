package Practice_Question;

// Write a function to find if a number is a palindrome or not. Take number as parameter.

import java.util.Scanner;

public class _10_Number_Palindrome
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("Palindrome check : " + find_palindrome(num));
    }

    public static boolean find_palindrome(int num)
    {
        int temp = num;
        int ans = 0;

        while (temp > 0)
        {
            int rem = temp % 10;
            ans = ans * 10 + rem;
            temp /= 10;
        }

        return ans == num;
    }


}
