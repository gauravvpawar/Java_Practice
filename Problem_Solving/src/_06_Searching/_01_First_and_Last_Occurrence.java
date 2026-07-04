package _06_Searching;

import java.util.Arrays;

public class _01_First_and_Last_Occurrence
{
    public static void main(String[] args) {
        int arr[] = {5 , 7 , 8 , 8 , 8 , 10};
        int target = 8;

        int ans[] = searchRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange(int[] nums, int target) {
        // if occurrence not found
        int ans[] = {-1 , -1} ;
        ans[0] = searchElement(nums , target , true);
        ans[1] = searchElement(nums , target , false); //for last occurrence
        return ans;
    }

    public static int searchElement(int arr[] , int target , boolean isFirstIdx)
    {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start <= end)
        {
            int mid = start + (end -start) /2;

            if(target < arr[mid])
            {
                end = mid -1;
            }else if(target > arr[mid])
            {
                start = mid + 1;
            }else {
                // found equal
                ans = mid;
                if(isFirstIdx)
                {
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }

        return ans;
    }
}
