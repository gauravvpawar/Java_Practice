package _01_Arrays;

import java.util.HashSet;

public class _26_Nth_repeatative
{
    public static void main(String[] args) {
        int arr[] = {1,2,3,3};
        System.out.println(repeatedNTimes(arr));
    }
    public static int repeatedNTimes(int[] nums) {
      int arr[] = new int[5000];
      for(int i = 0;i<nums.length;i++)
      {
          arr[nums[i]]++;
      }

      for(int i = 0;i<nums.length;i++)
      {
          if(arr[nums[i]] > 1)
          {
              return nums[i];
          }
      }

      return 0;
    }
}
