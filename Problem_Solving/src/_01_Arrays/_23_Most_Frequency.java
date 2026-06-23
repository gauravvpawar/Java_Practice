package _01_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _23_Most_Frequency {
    public static void main(String[] args) {
        /*
        Input: arr[] = [1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5], x = 4, y = 5
        Output: 4

        arr[] = [1, 2, 3, 4, 5, 6, 7, 8], x = 1, y = 7
        Output: 1
         */
//        Integer arr[] = {1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5};
        Integer arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));

        System.out.println(moreFrequent(arrayList, 1 , 7));
    }

    public static int moreFrequent(List<Integer> arr, int x, int y) {
        // code here
        int countX = 0 , countY = 0;

        for(int ele : arr)
        {
            if(ele == x) countX++;
            if(ele == y) countY++;
        }

        if(countX > countY) return x;
        if(countY > countX) return countY;

        return min(x , y);
    }

    public static int min(int x , int y)
    {
        if(x > y)
        {
            return x;
        }

        return y;
    }
}
