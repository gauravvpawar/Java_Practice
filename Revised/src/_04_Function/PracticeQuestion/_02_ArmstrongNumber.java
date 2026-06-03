package _04_Function.PracticeQuestion;

import java.util.Scanner;

// check the given number is armstrong number or not
public class _02_ArmstrongNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("Given number armstrong number or not : " + checkArmstrong(num));
    }

    public static boolean checkArmstrong(int num)
    {
        int countNumber = countDigit(num);

        int temp = num;
        int ans = 0;

        while (temp > 0)
        {
            int rem = temp % 10;
            // for armstrong you have to multiply till digit count then add it
            int findMultiply = findMultiply(rem , countNumber);

             ans = ans + findMultiply;

            temp /= 10;
        }

        return num == ans;
    }

    public static int findMultiply(int rem , int count)
    {
        int ans = 1;
        for(int i =1;i<=count;i++)
        {
            ans = ans * rem;
        }
        return ans;
    }

    public static int countDigit(int num)
    {
        int count = 0;

        while (num > 0)
        {
            count++;
            num /= 10;
        }
        return count;
    }
}
