package _05_Array._02_2DimensionArray;

import java.util.Scanner;

public class _02_AdditionOf_2_Matrix
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // take input of two matrix and print the sum of 2 matrix
        System.out.println("Enter the row size : ");
        int r = sc.nextInt();

        System.out.println("Enter the column size : ");
        int c = sc.nextInt();

        int arr1[][] = new int[r][c];
        int arr2[][] = new int[r][c];


        System.out.println("Enter the array element : " );
        takeInput(arr1);
        System.out.println("Enter the 2 nd array element : ");
        takeInput(arr2);

        System.out.println("First array : ");
        PrintArray(arr1);

        System.out.println("Second Array : ");
        PrintArray(arr2);

        for (int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                arr1[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Addition of array : ");
        PrintArray(arr1);

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

    public static void takeInput(int arr[][])
    {
        int r  = arr.length;
        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<arr[i].length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}

