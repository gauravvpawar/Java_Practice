package _07_SearchingTechnique._01_LinearSearch.Questions;

import java.util.Scanner;

public class _04_MinIdx
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

        // find the min idx
        int idx = -1;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++)
        {
            if(min > arr[i])
            {
                min = arr[i];
                idx = i;
            }
        }

        System.out.println("min : "+min + " and present At idx : " + idx);
    }
}
