package _05_Array._02_2DimensionArray;

import java.util.Scanner;

// print the given array in transpose of Matrix
/*
1 2 3       1   4   7
4 5 6  =>   2   5   8
7 8 9       3   6   9

 */
public class _01_Transpose_Of_Array
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size of array : ");
        int r = sc.nextInt();

        System.out.println("Enter the col size of array : ");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        System.out.println("Enter the array element : ");
        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Array : ");


        // to make that array transpose
        for(int i = 0;i<c;i++)
        {
            for(int j = 0;j<r;j++)
            {
                arr[j][i] = arr[i][j];
            }
        }

        System.out.println("After Transpose : ");
        PrintArray(arr);
    }

    public static void PrintArray(int arr[][])
    {
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = 0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
