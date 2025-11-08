package _1Dimesion_Array_Problems;

 // reverse the given array per element
/*
    example ->  input -> 98 25 75 45 65
                output-> 56 54 57 52 89
 */

import java.util.Arrays;
import java.util.Scanner;

public class _06_Reverse_Per_element
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int  num = sc.nextInt();

        int arr[] = new int[num];

        System.out.println("Enter the array value : ");
        for(int i = 0;i<num;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("original array : ");
        System.out.println(Arrays.toString(arr));

        int temp[] = new int[num];
        int rev[] = new int[num];

        for(int i = 0;i<num;i++)
        {
            temp[i] = arr[num -1 - i];

            while (temp[i] > 0)
            {
                int rem = temp[i] % 10;
                rev[i] = rev[i] * 10 + rem;

                temp[i] /= 10;
            }
        }

        System.out.println(Arrays.toString(rev));
    }
}
