package _07_SearchingTechnique._01_LinearSearch.Questions;

import java.util.Scanner;

// find the minimum number in array
// iterate though an array and find the min of the number
public class _03_FindMin
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

        int min = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++)
        {
            if(min > arr[i])
            {
                min = arr[i];
            }

        }

        System.out.println("Min : " + min);
    }
}
