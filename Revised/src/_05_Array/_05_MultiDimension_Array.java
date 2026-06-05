package _05_Array;

import java.util.Scanner;

public class _05_MultiDimension_Array
{
    public static void  main(String args[])
    {
        // multiDimension Array
        //Array containing more than two dimensions.
        //Commonly used for complex data structures.
        // inside the Array we have matrix

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the MultiDimension Array size : ");
        int l = sc.nextInt();

        System.out.println("Enter the size of row in matrix : ");
        int m = sc.nextInt();

        System.out.println("Enter the size of col in matrix");
        int n = sc.nextInt();

        int arr[][][] = new int[l][m][n];

        for(int i = 0;i<l;i++)
        {
            System.out.println("Enter " + i + " Array values : ");
            for(int j = 0;j<m;j++)
            {
                for(int k = 0;k<n;k++)
                {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println("Print the Multi Dimension Array : ");
        for(int i = 0;i<l;i++)
        {
            System.out.println("Printing " + i + " Array : ");
            for(int j = 0;j<m;j++)
            {
                for (int k = 0;k<n;k++)
                {
                    System.out.print(arr[i][j][k] + " ");
                }

                System.out.println();
            }
        }
    }
}
