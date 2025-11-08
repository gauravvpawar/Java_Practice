package _1Dimesion_Array_Problems;

// print the given array in the reverse format

import java.util.Arrays;
import java.util.Scanner;

public class _05_Reverse_Print_Array
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

        System.out.println("Given array in reverse format : ");
        for(int i = num-1;i>=0;i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
