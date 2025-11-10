package _02_2Diamension_Array_Problem;

import java.util.Scanner;

public class _01_Addition_Of_Two
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size of  array  1 : ");
        int row1 = sc.nextInt();
        System.out.println("Enter the col size of array 1 : ");
        int col1 = sc.nextInt();

        int arr1[][] = new int[row1][col1];

        System.out.println("Enter the row size of array 2 : ");
        int row2 = sc.nextInt();
        System.out.println("Enter the col size of array 2 : ");
        int col2 = sc.nextInt();

        int arr2[][] = new int[row2][col2];

        int sum[][] = new  int[row1][col1];


        System.out.println("Enter the first array element : ");
        for(int i = 0;i<row1;i++)
        {
            for(int j = 0;j<col1;j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the second  array : ");
        for(int i =0;i<row1;i++)
        {
            for(int j = 0;j<col1;j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }

        if(row1 != row2 && col1 != col2)
        {
            System.out.println("Please enter the equal number of row and col size : ");
            return;
        }

        for(int i = 0;i<row1;i++)
        {
            for(int j = 0;j<col1;j++)
            {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Addition of two array : ");
        for (int i = 0;i<row1;i++)
        {
            for(int j = 0;j<col1;j++)
            {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
