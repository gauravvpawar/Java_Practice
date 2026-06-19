package _03_Prefix_Sum;

import java.util.Arrays;

public class _07_Left_Right_Sum_Difference
{
    public static void main(String[] args) {
        int arr[] = {10 , 4 , 8 , 3};
        int ans[] = leftRightDifference(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int totalSum = 0;
        for(int ele : nums)
        {
            totalSum += ele;
        }

        // left sum
        int leftSum = 0;
        for(int i = 0;i<n;i++)
        {
            totalSum = totalSum - nums[i];
            ans[i] = Math.abs(leftSum - totalSum);
            leftSum = leftSum + nums[i];
        }

        return ans;
    }
}
