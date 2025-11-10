package _01_Linear_Search_Problem;
//https://leetcode.com/problems/richest-customer-wealth/description/
/*
    find the max wealth in the given array
    Input: accounts = [[1,2,3],[3,2,1]]
    Output: 6
 */

import java.util.Scanner;

public class _05_Max_Wealth
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  row size of array : ");
        int row = sc.nextInt();
        System.out.println("Enter the col size of array : ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];
        System.out.println("Enter the array element : ");
        for(int i = 0;i<row;i++)
        {
            System.out.println("Enter the array  " + i + " element : ");
            for(int j = 0;j<col;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        int rich_count = MaximumWealth(arr);
        System.out.println("Maximum wealth count : " + rich_count);
    }

    public static int MaximumWealth(int accounts[][])
    {
        int max = Integer.MIN_VALUE;

        for(int i = 0;i<accounts.length;i++)
        {
            int sum_per_person = 0;
            for(int j =0;j<accounts[i].length;j++)
            {
                sum_per_person = sum_per_person + accounts[i][j];
            }

            if(max < sum_per_person)
            {
                max = sum_per_person;
            }
        }
        return max;
    }

}
