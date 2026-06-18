package _01_Arrays;

//you enter array must be print in the ascending order array
/*
input = {-10, -3, 2 , 1, 4 , 5}
output ={1 , 4 , 9 , 16 , 25, 100}
 */

import java.util.Arrays;

public class _19_Square_Of_Element
{
    public static void main(String[] args) {
        int arr[] = {-10 , -3 , 1, 2, 4 , 5};
        int ans[] = sortArray(arr);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] sortArray(int arr[])
    {
        int n = arr.length;
        int start = 0;
        int end = n-1;

        int[] ans = new int[n];
        int j = 0;
        while (start <= end)
        {
            if(absoluteNum(arr[start]) > absoluteNum(arr[end]))
            {
                ans[j++] = arr[start] * arr[start];
                start++;
            }else{
                ans[j++] = arr[end] * arr[end];
                end--;
            }
        }

        return ans;
    }

    public static int absoluteNum(int x)
    {
        if(x < 0)
        {
            x = x * -1;
        }
        return x;
    }
}
