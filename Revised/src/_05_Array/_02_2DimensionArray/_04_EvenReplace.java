package _05_Array._02_2DimensionArray;

import java.util.Scanner;

// write the code that return the Even number replace with 0

public class _04_EvenReplace
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size : ");
        int r = sc.nextInt();

        System.out.println("Enter the column size : ");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        System.out.println("Enter the array element : ");
        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<arr[i].length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                if(arr[i][j] % 2 == 0)
                {
                    arr[i][j] = 0;
                }
            }
        }

        System.out.println("After Action : ");
        printArray(arr);
    }

    public static void printArray(int arr[][])
    {
        for(int i = 0;i< arr.length;i++)
        {
            for(int j = 0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
