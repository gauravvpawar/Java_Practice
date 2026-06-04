package _05_Array._1SingleDimensionArray;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
public class _08_EvenOddReplace
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
            if(arr[i]% 2== 0)
            {
                arr[i] = 1;
            }else {
                arr[i] = 0;
            }
        }

        System.out.println("After the action : ");
        System.out.println(Arrays.toString(arr));

    }
}
