package _03_Prefix_Sum;

public class _05_Prefix_Suffix_TotalSum_Check
{
    public static void main(String[] args) {
//        int arr[] = {5, 3 ,2 , 6 , 3 , 1};

        int arr[] = {1 ,1 , 1 , 1 , 1 , 1};
        System.out.println("check subarray of prefix and suffix sum : " +checkSubArray(arr));
    }

    public static boolean checkSubArray(int arr[])
    {
        int totalSum = totalSum(arr);

        // to find prefix
        int prefixSum = 0;
        for(int i = 0;i<arr.length;i++)
        {
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;

            if(prefixSum == suffixSum)
            {
                return true;
            }
        }

        return false;
    }

    public static int totalSum(int arr[])
    {
        int sum = 0;
        for(int i = 0;i<arr.length;i++)
        {
            sum += arr[i];
        }

        return sum;
    }
}
