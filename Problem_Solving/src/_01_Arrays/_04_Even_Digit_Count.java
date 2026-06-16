package _01_Arrays;

public class _04_Even_Digit_Count
{
    public static void main(String[] args) {
//[12,345,2,6,7896]
//Output: 2

        int arr[] = {12, 345 , 2,6,7896};
        System.out.println(findNumbers(arr));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;

        for(int i = 0;i< nums.length;i++)
        {
            if(checkNum(nums[i]))
            {
                count++;
            }
        }

        return count;
    }

    public static boolean checkNum(int num)
    {
        int count = 0;

        while (num > 0)
        {
            count++;
            num /= 10;
        }

        return (count % 2 == 0);
    }
}
