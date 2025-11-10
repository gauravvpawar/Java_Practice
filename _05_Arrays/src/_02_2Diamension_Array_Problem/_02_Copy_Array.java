package _02_2Diamension_Array_Problem;

import java.util.Scanner;

public class _02_Copy_Array
{
    public static void main(String[] args) {
//        copy first array value in the second one
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size of first array : ");
        int row1 = sc.nextInt();
        System.out.println("Enter the col size of first array : ");
        int col1 = sc.nextInt();

        int arr1[][] = new int[row1][col1];
        int arr2[][] = new int[row1][col1];

//        copy the  first array value in  the  second array
        System.out.println("Enter the first array value : ");
        for(int i = 0;i<row1;i++)
        {
            for(int j = 0;j<col1;j++)
            {

                arr1[i][j] = sc.nextInt();
                arr2[i][j] = arr1[i][j];
            }
        }

        System.out.println("Printing array 1 : ");
        printArr(arr1);
        System.out.println("Printing array 2 : ");
        printArr(arr2);

    }

    public  static void  printArr(int arr[][])
    {
        int row = arr.length;

        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
