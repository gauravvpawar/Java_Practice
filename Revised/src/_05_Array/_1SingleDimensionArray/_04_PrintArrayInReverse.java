package _05_Array._1SingleDimensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class _04_PrintArrayInReverse
{
    public static void main(String[] args) {
        // print the given array in reverse order
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int num = sc.nextInt();

        int arr[] = new int[num];
        System.out.println("Enter the array element : ");
        for(int i = 0;i<num;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array : ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Reverse order array : ");
        for(int i = num-1;i>=0;i--)
        {
            System.out.print(arr[i] +" ");
        }
    }
}
