package _01_Arrays;

//https://leetcode.com/problems/richest-customer-wealth/description/
// find the reachest wealth
/*
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
 */
public class _05_Richest_Wealth
{
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2 ,3} ,
                {3, 2 ,1}
        };
        System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;

        for(int i = 0;i<accounts.length;i++)
        {
            int sum = 0;
            for(int j = 0;j<accounts[i].length;j++)
            {
                sum += accounts[i][j];
            }

            if(sum > max)
            {
                max = sum;
            }
        }

        return max;
    }
}
