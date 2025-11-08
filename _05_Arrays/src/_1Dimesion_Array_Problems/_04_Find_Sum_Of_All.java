package _1Dimesion_Array_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class _04_Find_Sum_Of_All
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int  num = sc.nextInt();

        int arr[] = new int[num];

        System.out.println("Enter the array value : ");
        for(int i = 0;i<num;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("original array : ");
        System.out.println(Arrays.toString(arr));

        int total_sum = 0;

        for (int i = 0;i<num;i++)
        {
            total_sum += arr[i];
        }

        System.out.println("Total sum of given array : " + total_sum);
    }
}
