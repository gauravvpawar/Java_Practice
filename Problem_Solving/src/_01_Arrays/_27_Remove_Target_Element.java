package _01_Arrays;

import java.util.Arrays;

public class _27_Remove_Target_Element
{
    public static void main(String[] args) {
        //  remove the target element from the given array
        int nums[] = {3,2,2,3};
        int target = 3;

        int ans[] = removeElement(nums , target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] removeElement(int nums[] , int val)
    {
        int idx = 0;
        int size = nums.length;
        int i = 0;
        while (i < size)
        {
            if(nums[i] != val)
            {
                nums[idx++] = nums[i];
            }

            i++;
        }

        while (idx < size)
        {
            nums[idx++] = 3;
        }

        return nums;
    }
}
