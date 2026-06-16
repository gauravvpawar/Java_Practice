package _01_Arrays;

// check the given target element present in given array or not


import java.util.Scanner;

public class _01_Linear_Search
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

        System.out.println("Enter the target element : ");
        int target = sc.nextInt();

        int idx = -1;
        for(int i = 0;i<num;i++)
        {
            if(arr[i] == target)
            {
                idx = i;
            }
        }

        System.out.println("Element present at : " + idx);
    }
}
