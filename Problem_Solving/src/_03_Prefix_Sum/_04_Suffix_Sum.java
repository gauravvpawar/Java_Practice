package _03_Prefix_Sum;

import java.util.Arrays;

public class _04_Suffix_Sum
{
    public static void main(String[] args) {
        int arr[] = {5, 3 ,2 , 6 , 3 , 1};
        System.out.println("Original array : ");
        System.out.println(Arrays.toString(arr));
        suffixSum(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void suffixSum(int arr[])
    {
        int n = arr.length;

        for(int i = n-2;i>=0;i--)
        {
            arr[i] = arr[i] + arr[i+1];
        }
    }
}
