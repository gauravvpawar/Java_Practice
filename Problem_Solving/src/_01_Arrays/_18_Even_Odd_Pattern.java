package _01_Arrays;

// in the given array
// in that array even first the odd
/*
input = [1 ,3 ,4,5,6,8]
output= [8,6,4,5,3,1]
even then odd
 */

import java.util.Arrays;

public class _18_Even_Odd_Pattern
{
    public static void main(String[] args) {
        int arr[] = {1 , 3 , 4, 5, 6 , 8};

        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArray(int arr[])
    {
        int n = arr.length;
        int start = 0 , end = n-1;

        while (start < end)
        {
            if(arr[start] % 2 == 1 && arr[end] % 2 == 0)
            {
                // swap the number
                swap(arr, start ,end);
                start++;
                end--;
            }

            if(arr[start] % 2 == 0)
            {
                start++;
            }

            if(arr[end] % 2 != 0)
            {
                end--;
            }
        }
    }

    public static void swap(int arr[]  ,int start , int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
