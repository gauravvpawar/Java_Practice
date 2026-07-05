package _06_Searching;

public class _08_Find_Positive_Num
{
    public static void main(String[] args) {
        int arr[][] = { {3 ,2 ,1, - 1 }};

        System.out.println(findPositive(arr));
    }

    public static int findPositive(int nums[][])
    {
        int m = nums.length;
        int n = nums[0].length;

        int count = 0;
        int ans = 0;

        for(int i = 0;i<m;i++)
        {
            int start = 0;
            int end = n-1;

            while (start <= end)
            {
                int mid = start + (end - start) / 2;

                if(nums[i][mid] < 0)
                {
                    ans = mid;
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }

            count += ans;
        }

        return count;
    }
}
