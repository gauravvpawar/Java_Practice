package _05_Array._1SingleDimensionArray;

import java.util.Arrays;
import java.util.Scanner;

// write the program that reverse per element of the array
/*
e.g ->
input -> 98 11 23 56 89
output ->89 11 32 65 98
 */
public class _06_Reverse_Per_Element
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

        for(int i = 0;i<n;i++)
        {
            int rev = 0;
            while (arr[i] > 0)
            {
                int rem = arr[i] % 10;
                rev =  rev * 10 + rem;
                arr[i] /= 10;
            }

            arr[i] = rev;
        }

        System.out.println("After Reversing : ");
        System.out.println(Arrays.toString(arr));
    }
}
