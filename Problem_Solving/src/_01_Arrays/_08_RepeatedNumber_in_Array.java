package _01_Arrays;

import java.util.Scanner;

/*
find the first repetitive element in the given array
arr = { 1 , 5 , 3 , 4 , 6 , 3, 4}
ans = 3 (first repeat occurrence
 */

public class _08_RepeatedNumber_in_Array
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

        System.out.println("first repetitive occurrence : " + findFirstRepetitive(arr));
    }

    public static int findFirstRepetitive(int arr[])
    {
        int firstRepeat = 0;

        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i+1;j< arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    firstRepeat = arr[i];
                    break;
                }
            }
        }

        return firstRepeat;
    }
}
