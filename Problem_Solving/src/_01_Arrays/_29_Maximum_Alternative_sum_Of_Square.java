package _01_Arrays;

import java.util.Arrays;

public class _29_Maximum_Alternative_sum_Of_Square
{
    public static void main(String[] args) {
//        int arr[] = {1 , 2 , 3};
        int arr[] = {1,-1,2,-2,3,-3};
        long ans = maxAlternatingSum(arr);
        System.out.println(ans);
    }

    public static long maxAlternatingSum(int[] nums) {
        long ans = 0;
        int n = nums.length;
        // array is given
        // 1. find the square of each array element
        for(int i = 0;i<n;i++)
        {
            nums[i] = nums[i] * nums[i];
        }

        System.out.println(Arrays.toString(nums));

        // 2 . to sort an array according the square
//        sortArray(nums);
        sortArrayII(nums);
        System.out.println(Arrays.toString(nums));;
        // 3 . to find the alternate sum of element take two pointer from left to right
        // left one is positive and right is negative
        int start = 0, end = n-1;
        while (start < end)
        {
            ans = ans + nums[start] - nums[end];
            start++;
            end--;
        }

        if(start == end)
            ans = ans + nums[start];

        return ans;
    }

    public static void sortArray(int nums[])
    {
        int n = nums.length;
        for(int i = 0;i<n;i++)
        {
            for(int j = 1;j<n-i;j++)
            {
                if(nums[j-1] < nums[j])
                {
                    // swap the array value
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void sortArrayII(int[] nums) {
        int[] temp = new int[nums.length];
        mergeSort(nums, temp, 0, nums.length - 1);
    }

    static void mergeSort(int[] nums, int[] temp, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        mergeSort(nums, temp, left, mid);
        mergeSort(nums, temp, mid + 1, right);

        int i = left, j = mid + 1, k = left;

        while (i <= mid && j <= right) {
            temp[k++] = nums[i] >= nums[j] ? nums[i++] : nums[j++];
        }

        while (i <= mid) temp[k++] = nums[i++];
        while (j <= right) temp[k++] = nums[j++];

        for (k = left; k <= right; k++) {
            nums[k] = temp[k];
        }
    }
}
