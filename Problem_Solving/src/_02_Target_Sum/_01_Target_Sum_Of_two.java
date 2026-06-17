package _02_Target_Sum;

// array of element two element sum is equal to target count the number of pairs
// array = [1 , 2 , 3, ,4 ,5 ]  target = 8
// pairs 3 + 5 = 8 count = 1

import java.util.Scanner;

public class _01_Target_Sum_Of_two
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the array element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target number : ");
        int x = sc.nextInt();

        System.out.println("pairs : " + findCount(arr ,x));
    }

    public static int findCount(int arr[] , int target)
    {
        int count = 0;

        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                if((arr[i] +arr[j]) == target)
                {
                    count++;
                }
            }
        }

        return count;
    }
}
