package _01_Arrays;

import java.util.Scanner;

public class _07_Find_Second_max
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

        System.out.println("Second Max : " + findSecondMax(arr));
    }

    public static int findSecondMax(int arr[])
    {
        int max = Integer.MIN_VALUE;

        // first find maximum
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        // to covert max element to -infinity
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] == max)
            {
                arr[i] = -1;
            }
        }

        int smax = Integer.MIN_VALUE;
        // then find max again
        for(int j = 0;j<arr.length;j++)
        {
            if(arr[j] > smax)
            {
                smax = arr[j];
            }
        }

        return smax;
    }
}
