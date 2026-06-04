package _05_Array._1SingleDimensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class _05_FindSumOfEachElement
{
    public static void main(String[] args) {
        // find the sum of each element in the given array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array element : ");
        for(int i = 0 ;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array : ");
        System.out.println(Arrays.toString(arr));

        for(int i = 0;i<arr.length;i++)
        {
            int sum = 0;
            while (arr[i] > 0)
            {
                int rem = arr[i] % 10;
                sum = sum + rem;
                arr[i] /= 10;
            }
            arr[i] = sum;
        }

        System.out.println(Arrays.toString(arr));
    }
}
