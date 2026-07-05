package _06_Searching;

public class _09_Find_Positive_And_Negative
{
    public static void main(String[] args) {
//        int arr [] = {-2,-1,-1,1,2,3};
        int arr[] = {-3,-2,-1,0,0,1,2};
        System.out.println(maximumCount(arr));
    }

    public static int maximumCount(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        int negativeCount = 0;
        int positiveCount = 0;
        int ans = 0;
        while (start <= end)
        {
            int mid = start + (end- start) /2;

            if(nums[mid] < 0)
            {
                ans = mid;
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }

        negativeCount = n - ans - 1;
        System.out.println("Negative Count : " + negativeCount);
        positiveCount = positiveCount + n - negativeCount;
        System.out.println("Positive count " + positiveCount);

        return Math.max(positiveCount , negativeCount);
    }
}
