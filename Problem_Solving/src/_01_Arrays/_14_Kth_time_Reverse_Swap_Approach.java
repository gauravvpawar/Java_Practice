package _01_Arrays;

// rotate the given array with swap approach
// without creating another array

import static _01_Arrays._13_kth_Time_Reverse.printArray;

public class _14_Kth_time_Reverse_Swap_Approach
{
    public static void main(String[] args) {
        int arr[] = {1 , 2, 3 , 4 ,5 ,6};

        rotateArray(arr , 2);

        printArray(arr);
    }

    // rotate array with swap method
    public static void rotateArray(int arr[] , int r)
    {
        int n = arr.length;

        swap(arr , 0 , n-r-1);
        swap(arr , n-r , n-1);
        swap(arr, 0 ,n-1);

    }

    public static void swap(int arr[] , int start , int end)
    {
        while (start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }


}
