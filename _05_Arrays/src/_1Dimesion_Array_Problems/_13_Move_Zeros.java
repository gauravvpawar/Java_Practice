package _1Dimesion_Array_Problems;

//Input:  [0, 1, 0, 3, 12]
//Output: [1, 3, 12, 0, 0]

import java.util.Arrays;
import java.util.Scanner;

public class _13_Move_Zeros
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the array values : ");

        for(int i = 0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("original Array : ");
        System.out.println(Arrays.toString(arr));

        moveZero(arr);
        System.out.println("After moves : ");
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZero(int arr[])
    {
        int idx = 0;
        int i = 0;
        while (i < arr.length)
        {
            if(arr[i] != 0)
            {
                arr[idx++] = arr[i];
            }
            i++;
        }

        while (idx < arr.length)
        {
            arr[idx++] = 0;
        }

    }
}
