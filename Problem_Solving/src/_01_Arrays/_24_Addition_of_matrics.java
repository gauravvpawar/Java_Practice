package _01_Arrays;

import java.util.Scanner;

public class _24_Addition_of_matrics
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter row and column size : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr1[][] = new int[r][c];
        System.out.println("Enter the first array value :");
        takeInput(arr1);

        int arr2[][] = new int[r][c];
        System.out.println("Enter the second array value : ");
        takeInput(arr2);

        // addition of two matrices in another matrix
        int ans[][] = new int[r][c];
        for(int i = 0;i<ans.length;i++)
        {
            for(int j = 0;j<ans[i].length;j++)
            {
                ans[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        // to print the given array
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
