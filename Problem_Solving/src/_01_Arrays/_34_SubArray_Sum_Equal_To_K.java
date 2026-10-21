package _01_Arrays;

public class _34_SubArray_Sum_Equal_To_K
{
    public static void main(String[] args) {
//        int arr[] = {1 , 1 ,1};
//        int k = 2;
        int arr[] = {1 , 2 ,1 ,2 ,1};
        int k = 3;
        System.out.println(subarraySum(arr , k));

        System.out.println(subArraySumII(arr , k));
    }

    public static int subarraySum(int[] nums, int x) {
        int n = nums.length;
        int count = 0;
        for(int i = 0;i<n;i++)
        {
            int sum = 0;
            for(int j = i;j<n;j++)
            {
                System.out.print(nums[j]+" ");
                sum += nums[j];

                if(sum == x)
                {
                    count++;
                }
            }
            System.out.println();
        }

        return count;
    }


    public static int subArraySumII(int arr[] , int x)
    {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0;i<n;i++)
        {
            for(int j = i;j<n;j++)
            {
                int currSum = 0;
                for(int k = i;k<=j;k++)
                {
                    currSum += arr[k];
                }

                if(currSum == x)
                {
                    count++;
                }
            }
        }
        return count;
    }



}
