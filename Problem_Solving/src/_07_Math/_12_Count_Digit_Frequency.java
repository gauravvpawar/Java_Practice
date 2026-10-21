package _07_Math;

import java.util.*;

public class _12_Count_Digit_Frequency
{
    public static void main(String[] args) {
        _12_Count_Digit_Frequency ans = new _12_Count_Digit_Frequency();
        int arr[] = {1, 2, 2, 3, 3, 5};
//        ArrayList<ArrayList<Integer>> result =  ans.countFreq(arr);
//        System.out.println(result);
    }

    /*
    public  ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        List<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

        List<Integer> digitFreq = new ArrayList<Integer>();
        for(int i = 0;i<arr.length;i++)
        {
            int count = 1;
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }

            digitFreq.add(arr[i]);
            digitFreq.add(count);
        }

        ans.add(digitFreq);
        return  ans;
    }

     */
}
