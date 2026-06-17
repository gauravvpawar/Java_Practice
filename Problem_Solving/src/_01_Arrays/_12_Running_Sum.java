package _01_Arrays;

import  java.util.*;
public class _12_Running_Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the array element : ");
        for (int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

    }

    public static int[] runningSum(int[] nums) {
        for(int i = 1;i<nums.length;i++)
        {
            nums[i] = nums[i] + nums[i-1];
        }

        // input [1,2,3,4]
        // output[1,3,6,10]

        return nums;
    }
}
