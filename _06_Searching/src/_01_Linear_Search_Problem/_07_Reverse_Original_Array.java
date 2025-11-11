package _01_Linear_Search_Problem;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class _07_Reverse_Original_Array
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
        int start = 0 , end = arr.length - 1;

        while (start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("After reverse : ");
        System.out.println(Arrays.toString(arr));
    }
}
