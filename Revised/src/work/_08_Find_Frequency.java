package work;

import java.util.LinkedHashMap;

public class _08_Find_Frequency
{
    public static void main(String[] args) {
       int arr[] = {1 ,  2 , 3 ,4 , 1};

       int freq[] = new int[1000];

       for(int i = 0;i<arr.length;i++)
       {
           freq[arr[i]]++;
       }

        LinkedHashMap hs = new LinkedHashMap();
       for(int i = 0;i<arr.length;i++)
       {
           hs.put(arr[i] , freq[arr[i]]);
       }

        System.out.println(hs);
    }
}
