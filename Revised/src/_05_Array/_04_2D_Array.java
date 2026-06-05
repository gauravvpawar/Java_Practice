package _05_Array;

import java.util.Scanner;

public class _04_2D_Array
{
    public static void main(String[] args) {
        // 2 Dimensional array to take input and print that array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size of array : ");
        int n = sc.nextInt();

        System.out.println("Enter the col size of array : ");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        System.out.println("Enter the array element : ");
        for (int i = 0;i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("original Array : ");
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
