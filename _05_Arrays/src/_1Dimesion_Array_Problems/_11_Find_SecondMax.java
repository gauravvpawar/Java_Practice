package _1Dimesion_Array_Problems;

import java.util.Arrays;
import java.util.Scanner;

//Input:  [10, 5, 8, 10, 3]
//Output: 8
public class _11_Find_SecondMax
{
    public static void main(String[] args) {
        // find the second max in given array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the array element : ");

        for(int i = 0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array :");
        System.out.println(Arrays.toString(arr));
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i = 0;i<size;i++)
        {
            if(max < arr[i])
            {
                smax = max;
                max = arr[i];
            }
            else if(smax < arr[i]  && max > arr[i])
            {
                smax = arr[i];
            }
        }

        System.out.println("max : " + max);
        System.out.println("smax : " + smax);
    }
}
