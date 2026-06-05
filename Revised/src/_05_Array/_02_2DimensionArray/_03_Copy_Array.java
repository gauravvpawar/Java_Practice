package _05_Array._02_2DimensionArray;

// copy one array into another

import java.util.Scanner;

public class _03_Copy_Array
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size : ");
        int r = sc.nextInt();

        System.out.println("Enter the column size : ");
        int c = sc.nextInt();

        int arr1[][] = new int[r][c];
        int arr2[][] = new int[r][c];

        System.out.println("Enter the array element : ");
        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                arr1[i][j] = sc.nextInt();
                arr2[i][j] = arr1[i][j];
            }
        }

        System.out.println("printing the arrays");
        printArray(arr1);
        System.out.println("Printing second Array");
        printArray(arr2);
    }

    public static void printArray(int arr[][])
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
