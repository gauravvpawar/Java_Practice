package _01_Arrays;

public class _21_Remove_Duplicate_Element
{
    public static void main(String[] args) {
            int arr[] = {1,1,2};
            // output = {1 , 2}
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 1;
        int j = 1;
        while (j < nums.length)
        {
            if(nums[j] != nums[i- 1])
            {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }

        return i;
    }
}
