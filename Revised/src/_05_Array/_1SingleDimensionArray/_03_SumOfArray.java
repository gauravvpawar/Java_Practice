package _05_Array._1SingleDimensionArray;

import java.util.Arrays;
import java.util.Scanner;

// find the sum of all element in the given array
public class _03_SumOfArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int num = sc.nextInt();
        int arr[] = new int[num];

        System.out.println("Enter the array element : ");
        for(int i = 0;i<num;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array : ");
        System.out.println(Arrays.toString(arr));

        int sum = 0;
        for(int i = 0;i<num;i++)
        {
            sum += arr[i];
        }

        System.out.println("Sum of all element of array : " + sum);
    }
}
