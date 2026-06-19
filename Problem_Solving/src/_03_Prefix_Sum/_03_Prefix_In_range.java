package _03_Prefix_Sum;

// find the sum of array in range
// and range as index

import java.util.Scanner;

public class _03_Prefix_In_range
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n+1];
        System.out.println("Enter the array element : ");
        for(int i = 1;i<n+1;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("original Array");
        printArray(arr);

        int[] prefixSum = prefixSum(arr);

        System.out.println("Enter the start and end range: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        int ans = prefixSum[end] - prefixSum[start-1];
        System.out.println("ans : " + ans);

    }

    public static int[] prefixSum(int arr[])
    {
        int n = arr.length;
        int ans[] = new int[n];

        for(int i = 1;i<n;i++)
        {
            ans[i] = arr[i] + ans[i-1];
        }
        return ans;
    }

    public static void printArray(int arr[])
    {
        int n = arr.length;
        for(int i = 1;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
