package _02_Target_Sum;

/*
Input: k = 3, arr[] = [6, 2, 5, 2, 2, 6, 6]
Output: 5
Explanation: Every element appears 3 times except 5.

 */

import java.util.Scanner;

public class _03_Find_Unique_Element
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

        System.out.println(findUnique(arr));

    }

    public static int findUnique(int arr[])
    {
        int n = arr.length;
        int unique = -1;
        for(int i = 0;i<n;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                if(arr[i] == arr[j])
                {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        for(int k = 0;k<n;k++)
        {
            if(arr[k] > 0)
            {
                unique = arr[k];
            }
        }

        return unique;
    }
}
