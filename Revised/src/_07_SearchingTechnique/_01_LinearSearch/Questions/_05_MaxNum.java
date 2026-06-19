package _07_SearchingTechnique._01_LinearSearch.Questions;

import java.util.Scanner;

public class _05_MaxNum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the array element : ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        System.out.println("Maximum value in array : " + max);
    }

}
