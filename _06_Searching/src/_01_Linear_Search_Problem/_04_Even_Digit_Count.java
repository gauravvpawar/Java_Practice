package _01_Linear_Search_Problem;

import java.util.Scanner;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// find the digit count array which element is even then show the count
public class _04_Even_Digit_Count
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr : ");
        int num = sc.nextInt();

        int arr[] = new int[num];
        System.out.println("Enter the array element : ");
        for(int i = 0;i<num;i++)
        {
            arr[i] = sc.nextInt();
        }

        int count = findNumbers(arr);
        System.out.println("Even count arr : " + count);
    }

    public static int  findNumbers(int arr[])
    {
        int count = 0;

        for(int i = 0;i<arr.length;i++)
        {
            if(findCount(arr[i]) % 2 == 0)
            {
                count++;
            }
        }

        return count;
    }

    public static int findCount(int num)
    {
        int digit = 0;
        while (num > 0)
        {
            if(num % 10 != 0)
            {
                digit++;
            }

            num /= 10;
        }
        return digit;
    }
}
