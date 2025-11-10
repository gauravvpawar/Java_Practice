package _02_2Diamension_Array_Problem;

import java.util.Scanner;

public class _03_Even_Sum
{
    public static void main(String[] args) {
//        To take the input  array and print the even sum of given array:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size of array :");
        int row = sc.nextInt();
        System.out.println("Enter the col size of array : ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        System.out.println("Enter the array element : ");
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original array : ");
        for(int ele[] : arr)
        {
            for(int each : ele)
            {
                System.out.print(each + " ");
            }
            System.out.println();
        }

        int sum = 0;

        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                if(arr[i][j] % 2 == 0)
                {
                    sum = sum + arr[i][j];
                }

            }
        }

        System.out.println("Even number sum: " + sum);
    }
}
