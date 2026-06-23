package _01_Arrays;

import java.util.ArrayList;

public class _22_Equal_Position
{
    public static void main(String[] args) {
        int arr[] = {1};
        ArrayList<Integer> ans = valEqualToPos(arr);
        System.out.println(ans);
    }

    public static ArrayList<Integer> valEqualToPos(int[] arr) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 1;i<=arr.length;i++)
        {
            if(i == arr[i-1])
            {
                al.add(arr[i-1]);
            }
        }

        return al;
    }
}
