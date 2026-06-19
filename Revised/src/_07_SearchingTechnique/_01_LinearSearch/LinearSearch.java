package _07_SearchingTechnique._01_LinearSearch;

import java.util.Scanner;

// in linear search check the given target element is present in array or not
// arr[] = {11,22,33,44,55}
// target = 44
// if element is present in given array return 3 or else it return -1
// -1 for the when the element does not exist in the array
public class LinearSearch
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

        System.out.println("Enter the target number : ");
        int target = sc.nextInt();

        int idx = -1;

        for(int i = 0;i<n;i++)
        {
            if(arr[i] == target)
            {
                idx = i;
            }
        }

        System.out.println("Given target element is present at idx : " + idx);
    }
}
