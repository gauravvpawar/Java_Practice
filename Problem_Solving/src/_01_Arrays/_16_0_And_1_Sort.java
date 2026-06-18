package _01_Arrays;

// in array we have 0 and 1 we have to sort the array
/*
input ->   [0,1,0,1,0]
output -> [0, 0 ,0,1,1]

 */

import java.util.Arrays;
import java.util.Scanner;

public class _16_0_And_1_Sort
{
    public static void main(String[] args) {
        int arr[] = {0 ,1 , 0 ,1 , 0};

//        sortArray1(arr);
        sortArray2(arr);
        System.out.println(Arrays.toString(arr));
    }

    // first approach
    public static void sortArray1(int arr[])
    {
        int n = arr.length;
        int count = 0;
        for(int i = 0;i<n;i++)
        {
            if(arr[i] == 0)
            {
                count++;
            }
        }

        for(int j = 0;j<n;j++)
        {
            if(j<count)
            {
                arr[j] = 0;
            }else{
                arr[j] = 1;
            }
        }
    }

    // second approach
    public static void sortArray2(int arr[])
    {
        int start = 0;
        int end = arr.length-1;

        while (start < end)
        {
            if(arr[start] == 1 &&  arr[end] == 0)
            {
                // then swap the number
                swap(arr,start , end);
                start++;
                end--;
            }

            if(arr[start] == 0)
            {
                start++;
            }

            if(arr[end] == 1)
            {
                end--;
            }


        }
    }

    public static void swap(int arr[] , int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
