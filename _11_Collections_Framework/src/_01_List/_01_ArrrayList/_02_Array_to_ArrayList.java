package _01_List._01_ArrrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_Array_to_ArrayList
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the array element : " );
        for(int i = 0;i<num;i++)
        {
            arr[i] = sc.nextInt();
        }

        ArrayList al1 = new ArrayList();
        for(int i = 0;i<num;i++)
        {
            al1.add(arr[i]);
        }

        System.out.println(al1);
    }
}
