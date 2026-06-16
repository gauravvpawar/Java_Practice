package _01_Arrays;

import java.util.Scanner;

public class _02_Largest_Element
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int num = sc.nextInt();

        int arr[] = new int[num];

        System.out.println("Enter the array element : ");
        for(int i = 0;i<num;i++)
        {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        System.out.println("max : " + max);
    }
}
