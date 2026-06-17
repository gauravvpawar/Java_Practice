package _01_Arrays;

/*
find the 2nd repetitive element in given array
int arr[] = {1 , 2 , 3 , 5 , 2, 3};
ans = 3
 */

import java.util.Scanner;

public class _09_Last_Repetitive_element
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

        System.out.println("second repetitive : " + secondRepeat(arr));
    }

    public static int secondRepeat(int arr[])
    {
        int SecondRepeat = 0;
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    SecondRepeat = arr[j];
                }
            }
        }

        return SecondRepeat;
    }
}
