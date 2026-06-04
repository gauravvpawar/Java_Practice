package _05_Array._1SingleDimensionArray;

import java.util.Arrays;
import java.util.Scanner;

// find the minimum element from the given array
public class _02_FindMinElement
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array element : ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("original Array : ");
        System.out.println(Arrays.toString(arr));

        int min = Integer.MAX_VALUE;

        for(int i = 0;i<n;i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        System.out.println("Min element of given array : " + min);
    }
}
