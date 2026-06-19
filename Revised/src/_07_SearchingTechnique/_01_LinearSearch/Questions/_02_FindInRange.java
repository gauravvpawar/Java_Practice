package _07_SearchingTechnique._01_LinearSearch.Questions;

import java.util.Scanner;

public class _02_FindInRange
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

        System.out.println("Enter the target element : ");
        int target = sc.nextInt();

        System.out.println("Enter the star idx : ");
        int start = sc.nextInt();

        System.out.println("Enter the end idx : ");
        int end = sc.nextInt();

        int idx = -1;
        for(int i = start;i<=end;i++)
        {
            if(arr[i] == target)
            {
                idx = i;
            }
        }

        System.out.println("Target element is present at : " + idx);
    }
}
