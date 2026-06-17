package _01_Arrays;

import java.util.*;

public class _11_Revers_Array
{
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the array size : ");
//        int n = sc.nextInt();
//
//        int arr[] = new int[n];
//        System.out.println("Enter the array element : ");
//        for (int i = 0;i<n;i++)
//        {
//            arr[i] = sc.nextInt();
//        }

        int a = 10 ;
        int b =  20;
        swap(a, b);
        System.out.println(a);
        System.out.println(b);
    }

    public static void swap(int a , int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
}
