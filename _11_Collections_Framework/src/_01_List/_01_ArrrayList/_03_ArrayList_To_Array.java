package _01_List._01_ArrrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _03_ArrayList_To_Array
{
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        al1.add(50);

        System.out.println(al1);
        int num = al1.size();
        int arr[] =new int[num];
        for(int i = 0;i<num;i++)
        {
            arr[i] = (int)al1.get(i);
        }

        System.out.println(Arrays.toString(arr));
    }
}
