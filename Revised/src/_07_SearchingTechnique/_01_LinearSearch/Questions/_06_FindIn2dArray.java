package _07_SearchingTechnique._01_LinearSearch.Questions;

// check the given target num present in 2d Array or not

import java.util.Scanner;

public class _06_FindIn2dArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size : ");
        int r = sc.nextInt();

        System.out.println("Enter the col size : ");
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

        System.out.println("Enter the target num : ");
        int target = sc.nextInt();
        int row = -1;
        int col = -1;
        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                if(arr[i][j] == target)
                {
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println("Target idx is present at row : " + row +" and col : " + col);
    }
}
