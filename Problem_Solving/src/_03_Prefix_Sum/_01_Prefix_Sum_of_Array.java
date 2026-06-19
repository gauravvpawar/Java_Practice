package _03_Prefix_Sum;

// basic approach you create the new and add sum of previous one with that index
// arr = [1 , 2 ,3 ,4 ,5]
// ans = [1 , 3 , 6, 10 , 15]

import java.util.Arrays;

public class _01_Prefix_Sum_of_Array
{
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 3 ,4 ,5};

        int ans[] = PrefixSum(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] PrefixSum(int arr[])
    {
        int n = arr.length;
        int ans[] = new int[n];

        ans[0] = arr[0];

        // to add sum of each
        for(int i = 1;i<n;i++)
        {
            arr[i] = arr[i] + arr[i-1];
            ans[i] = arr[i];
        }

        return ans;
    }
}
