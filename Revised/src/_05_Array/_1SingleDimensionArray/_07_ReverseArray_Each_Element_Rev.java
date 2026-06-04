package _05_Array._1SingleDimensionArray;

import java.util.Arrays;
import java.util.Scanner;

// write the program that return the reverse of the given array in reverse element it also be the reverse
/*
e.g input -> 98 11 23  56 89
    output-> 98 65 32 11 89
 */
public class _07_ReverseArray_Each_Element_Rev
{
    public static void main(String[] args) {
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

        // to reverse the original one
        int start = 0,end = n-1;
        while (start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("Reverse Original array : ");
        System.out.println(Arrays.toString(arr));

        for(int i = 0;i<n;i++)
        {
            int rev = 0;
            while (arr[i] > 0)
            {
                int rem = arr[i]% 10;
                rev = rev * 10 +rem;
                arr[i] /= 10;
            }

            arr[i] = rev;
        }

        System.out.println("After reverse in each element itself : ");
        System.out.println(Arrays.toString(arr));
    }
}
