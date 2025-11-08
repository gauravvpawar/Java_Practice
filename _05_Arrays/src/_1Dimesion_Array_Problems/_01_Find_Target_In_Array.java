package _1Dimesion_Array_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Find_Target_In_Array
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int  num = sc.nextInt();

        int arr[] = new int[num];

        for(int i = 0;i<num;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the target element : ");
        int target = sc.nextInt();
        int idx = 0;
        for(int i = 0;i<num;i++)
        {
            if(arr[i] == target)
            {
               idx = i;
               break;
            }
        }

        if(idx == 0)
        {
            System.out.println("Target not found in the given array : ");
        }else
        {
            System.out.println("Target is found at idx : " + idx);
        }
    }
}
