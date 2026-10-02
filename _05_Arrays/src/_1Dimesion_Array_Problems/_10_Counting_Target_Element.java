package _1Dimesion_Array_Problems;

// check the given target element present in n time count that
// arr = {1 , 2, 3, 3, 4,5, 3 ] , target = 3;
// count = 3

import java.util.Arrays;
import java.util.Scanner;

public class _10_Counting_Target_Element
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the array element : ");
        for(int i = 0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array : ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the target element : ");
        int target = sc.nextInt();
        int count = 0;
        for(int i = 0;i<size;i++)
        {
            if(arr[i] == target)
            {
                count++;
            }
        }

        System.out.println("Target element count : " + count);
    }
}
