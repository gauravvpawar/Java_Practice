package _1Dimesion_Array_Problems;

import java.util.Arrays;
import java.util.Scanner;

/*
    print the odd index have one value and the odd index have the  0
    example -> 1 2 3 4 5
               0 1 0 1 0
 */

public class _07_Even_Odd_Action
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

        for (int i = 0;i<num;i++)
        {
            if(arr[i] % 2 == 0)
            {
                arr[i] = 1;
            }else{
                arr[i] = 0;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
