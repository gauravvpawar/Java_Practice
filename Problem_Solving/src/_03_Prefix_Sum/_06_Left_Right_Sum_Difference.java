package _03_Prefix_Sum;

import java.util.Arrays;

//https://leetcode.com/problems/left-and-right-sum-differences/
/*
Input: nums = [10,4,8,3]
Output: [15,1,11,22]
 */
public class _06_Left_Right_Sum_Difference {
    public static void main(String[] args) {
        int arr[] = {10 , 4 , 8 , 3};
        int ans[] = leftRightDifference(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int totalSum = findSum(nums);
        // left sum
        int prefixSum = 0;
        for(int i = 0;i<n;i++)
        {
            int suffixSum = totalSum - prefixSum - nums[i];

             ans[i] = Math.abs(prefixSum - suffixSum);
             prefixSum += nums[i];
        }

        return ans;
    }

    public static int findSum(int arr[])
    {
        int n = arr.length;
        int sum = 0;
        for(int i = 0;i<n;i++)
        {
            sum = sum +  arr[i];
        }
        return sum;
    }
}
