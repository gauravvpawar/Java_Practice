package _13_Collection_Framework._01_List;

// in that we can store

import java.util.ArrayList;
import java.util.Arrays;

public class _01_1_ArrayList_to_Array
{
    public static void main(String[] args) {
        ArrayList al = new ArrayList(); // in array list we can store all object type of data
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);

        int arr[] = new int[al.size()]; // in arraylist all data must have to be same type

        for(int i = 0;i<al.size();i++)
        {
            arr[i] = (int)al.get(i);
        }

        // to print the array
        System.out.println("Printing array : ");
        System.out.println(Arrays.toString(arr));
    }
}
