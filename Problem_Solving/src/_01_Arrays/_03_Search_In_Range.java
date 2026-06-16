package _01_Arrays;

import java.util.Scanner;

public class _03_Search_In_Range
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

        System.out.println("Enter the target number: ");
        int target = sc.nextInt();

        System.out.println("Start range : ");
        int start = sc.nextInt();

        System.out.println("end range : ");
        int end = sc.nextInt();

        int idx = -1;

        for(int i = start;i<=end;i++)
        {
            if(arr[i] == target)
            {
                idx = i;
            }
        }

        System.out.println("Target present at idx: " + idx);
    }
}
