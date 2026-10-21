package _01_Arrays;

import java.util.Arrays;

public class _28_Remove_Duplicate_from_Sorted_Array
{
    public static void main(String[] args) {
        int arr[] = {1 , 1, 2, 2, 3};
        int ans = removeDuplicate(arr);
        System.out.println(ans);
     }

     public static int removeDuplicate(int nums[])
     {
         int n = nums.length-1;
         int i = 1;
         int count = 1;
         while (i <= n)
         {
             if(nums[i] != nums[i -1])
             {
                count++;
             }
             i++;
         }

         return count;
     }
}
