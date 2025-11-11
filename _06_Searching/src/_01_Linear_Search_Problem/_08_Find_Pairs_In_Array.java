package _01_Linear_Search_Problem;

import java.util.Arrays;
import java.util.Scanner;

public class _08_Find_Pairs_In_Array
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the array element : ");
        for(int i =0;i<num;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array : ");
        System.out.println(Arrays.toString(arr));

        for(int i = 0;i<num;i++)
        {
            for(int j = i+1;j<num;j++)
            {
                System.out.print("[" +arr[i] + " , "  + arr[j]+ " ] ");
            }
            System.out.println();
        }
    }
}
