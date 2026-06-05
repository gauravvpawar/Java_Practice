package _05_Array;

import java.util.Scanner;

public class _06_JaggedArray
{
    public static void main(String[] args) {
        // jagged array is same like 2 Dimension array but the number of column is different in row
        int arr[][] = {
                {1,2,3} ,
                {4, 5},
                {6,7,8,9}
        };

        for(int i[] : arr)
        {
            for(int ele : i)
            {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
