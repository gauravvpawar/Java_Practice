package _01_Arrays;

import java.util.ArrayList;

public class _06_MinMax_Element {
    public static void main(String[] args) {
//        Input: arr[] = [1, 4, 3, 5, 8, 6]
//        Output: [1, 8]

        int arr[] = {1 ,4 , 3 , 5 ,8 , 6};
        System.out.println(getMinMax(arr));
    }

    public static ArrayList<Integer> getMinMax(int[] arr) {
        // code Here

        int min = arr[0];
        int max = arr[0];

        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }

            if(max < arr[i])
            {
                max = arr[i];
            }
        }

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(min);
        al.add(max);

        return al;
    }
}
