package _1Dimesion_Array_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class _02_Find_Min_In_Array
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

        int min = arr[0];
        for(int i = 1 ; i<num;i++)
        {
            if(min > arr[i])
            {
                min = arr[i];
            }
        }

        System.out.println("Min value in given array : " + min);
    }
}
