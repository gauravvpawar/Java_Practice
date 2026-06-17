package _01_Arrays;

/*
write the code that return the second min from given array
arr = {1 , 2, 3 , 4, 5, 6};

 */

import java.util.Scanner;

public class _10_Second_min_Element
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the array element : ");
        for (int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Second minimum: " + secondMinimum(arr));
    }

    public static int secondMinimum(int arr[])
    {
        int min = Min(arr);

        // to assign min into max values(100)
        for(int i = 0;i<arr.length;i++)
        {
            if(min == arr[i])
            {
                arr[i] = 100;
            }
        }

        int smin = Min(arr);
        return smin;
    }

    public static int Min(int arr[])
    {
        int min = Integer.MAX_VALUE;

        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        return min;
    }
}
