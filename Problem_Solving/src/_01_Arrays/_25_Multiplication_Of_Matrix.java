package _01_Arrays;

import java.util.Scanner;

public class _25_Multiplication_Of_Matrix
{
      static   Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the row and column size of matrix : ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int arr1[][] = new int[r1][c1];
        System.out.println("Enter the array first value : ");
        takeInput(arr1);

        printArray(arr1);

        System.out.println("Enter array 2 row and col : ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int arr2[][] = new int[r2][c2];
        System.out.println("Enter the second array value : ");
        takeInput(arr2);

        printArray(arr2);

//        // means if check the column is
        if(c1 != r2)
        {
            return;
        }

        int ans[][] = new int[r1][c2];

        for(int i = 0;i<r1;i++)
        {
            for(int j = 0;j<c2;j++)
            {
                for(int k = 0;k<c1;k++)
                {
                    ans[i][j] += (arr1[i][k] * arr2[k][j]);
                }
            }
        }

        System.out.println("after the multiplication : ");
        printArray(ans);


    }

    public static void printArray(int arr[][])
    {
        System.out.println("print the given array : ");
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = 0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void takeInput(int arr[][])
    {
        for(int i =0;i<arr.length;i++)
        {
            for (int j = 0;j<arr[i].length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}
