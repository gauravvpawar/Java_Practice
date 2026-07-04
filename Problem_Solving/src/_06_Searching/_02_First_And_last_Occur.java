package _06_Searching;

import java.util.Arrays;

public class _02_First_And_last_Occur
{
    public static void main(String[] args) {
        int arr[] = {5 , 7 , 7 , 8 , 8 , 10};
        int target = 8;

        int ans[] = searchRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange(int arr[] , int target)
    {
        int ans[] = {-1 , -1};
        int start = 0, end = arr.length -1;

        while (start <= end)
        {
            if(arr[start] == target && ans[0] == -1)
            {
                ans[0] = start;
            }

            if(arr[end] == target && ans[1] == -1)
            {
                ans[1] = end;
            }

            start++;
            end--;
        }

        return ans;
    }
}
