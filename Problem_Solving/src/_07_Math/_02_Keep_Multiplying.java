package _07_Math;

public class _02_Keep_Multiplying
{
    public static void main(String[] args) {
        int arr[] = {5,3,6,1,12};
        int original = 3;
        System.out.println(findFinalValue(arr , original));
    }

    public static int findFinalValue(int[] nums, int original) {
        int n = nums.length;
        int i = 0;
        while(i<n)
        {
            if(nums[i] == original)
            {
                original = 2 * original;
                System.out.println(original);
                i = 0;
            }

            i++;
        }

        return original;
    }
}
