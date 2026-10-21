package _01_Arrays;

import java.util.Arrays;

public class _30_Maximum_Alternative_Sum_II
{
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 3};
        long ans = maxAlternatingSum(arr);
        System.out.println(ans);
    }

    public static long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i = 0;i<n;i++)
        {
            nums[i] *= nums[i];
        }

        Arrays.sort(nums);
        long ans = 0;
        for(int i = 0;i<n/2;i++)
        {
            ans -= nums[i];
        }

        for(int i = n/2;i<n;i++)
        {
            ans += nums[i];
        }

        return ans;
    }
}
