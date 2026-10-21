package Questions;

import java.util.Arrays;

public class _25_RotateArray {
    public static void main(String[] args) {
        int arr[] = {1 ,2 ,3 ,4 ,5};
        int k = 2;
        int ans[] = rotateArray(arr , k);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] rotateArray(int arr[] , int k)
    {
        int n = arr.length;
        k = k % n;

        //swap array
        swapArr(arr , 0 , k);
        swapArr(arr , k+1 , n-1);
        swapArr(arr , 0 , n-1);
        return arr;
    }

    public static void swapArr(int arr[] , int start , int end)
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
