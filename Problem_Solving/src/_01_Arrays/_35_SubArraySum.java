package _01_Arrays;

public class _35_SubArraySum
{
    public static void main(String[] args) {
//        int arr[] = {1 , 2 ,3 ,4 ,5};
        int arr[] = {-1};
//        System.out.println(subArraySumI(arr));

//        System.out.println(subArraySumII(arr));

        System.out.println(subArraySumIII(arr));
    }

    public static int subArraySumI(int arr[])
    {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++)
        {
            for(int j = i;j<n;j++)
            {
                int currSum = 0;
                for(int k = i;k<=j;k++)
                {
                    currSum += arr[k];
                }

                if(currSum > maxSum)
                {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    public static int subArraySumII(int arr[])
    {
        int n = arr.length;
        // to first find the prefix sum of array
        int prefixSum[] = new int[n];
        prefixSum[0] = arr[0];

        for(int i = 1;i<n;i++)
        {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++)
        {
            for(int j = i;j<n;j++)
            {
                int currSum = (i == 0) ? prefixSum[j] : prefixSum[j] - prefixSum[i-1];

                if(maxSum < currSum)
                {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }


    // maximum Sub Array sum by kadane;s algorithm
    public static int subArraySumIII(int arr[])
    {
        int n = arr.length;
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++)
        {
            curSum = curSum + arr[i];
            if(maxSum < curSum)
            {
                maxSum = curSum;
            }
            if(curSum < 0)
            {
                curSum = 0;
            }
        }

        return maxSum;
    }
}

