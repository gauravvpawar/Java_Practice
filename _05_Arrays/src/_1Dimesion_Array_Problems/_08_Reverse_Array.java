package _1Dimesion_Array_Problems;

import java.util.Arrays;

public class _08_Reverse_Array
{
    public static void main(String[] args) {
        int arr[] = {10 , 20 , 30, 40 , 50};
        System.out.println(Arrays.toString(arr));

        swap(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int arr[])
    {
        int i =  0 , j = arr.length -1;

        while (i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}
