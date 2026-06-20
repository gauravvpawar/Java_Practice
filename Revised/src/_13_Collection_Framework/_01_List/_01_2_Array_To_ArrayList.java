package _13_Collection_Framework._01_List;

// in that we can direct store the value of array to arraylist

import java.util.ArrayList;

public class _01_2_Array_To_ArrayList
{
    public static void main(String[] args) {
        int arr[] = {10 , 20 , 30 , 40 , 50};

        ArrayList al = new ArrayList();

        for(int i = 0;i<arr.length;i++)
        {
            al.add(arr[i]);
        }

        System.out.println("Print the Arraylist : ");
        System.out.println(al);
    }
}
