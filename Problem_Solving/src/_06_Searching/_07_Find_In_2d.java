package _06_Searching;

public class _07_Find_In_2d
{
        public static void main(String[] args) {
        int arr[][] = { {3 ,2 ,1, - 1 }};

        System.out.println(findNegative(arr));
    }

    public static int findNegative(int nums[][])
    {
        int m = nums.length;
        int n = nums[0].length;

        int count = 0;

        for(int i = 0;i<m;i++)
        {
            int start = 0;
            int end = n-1;

            while (start < end)
            {
                int mid = start + (end - start)/2;

                if(nums[i][mid] < 0)
                {
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
            count = count + n - start;
        }

        return count;
    }
}
