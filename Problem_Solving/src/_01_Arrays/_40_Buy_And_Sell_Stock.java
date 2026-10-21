package _01_Arrays;

public class _40_Buy_And_Sell_Stock
{
    public static void main(String[] args) {
        _40_Buy_And_Sell_Stock obj = new _40_Buy_And_Sell_Stock();
        int prices[] = {7,1,5,3,6,4};
        System.out.println(obj.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int totalProfit = 0;
        for(int i = 1;i<n;i++)
        {
            if(prices[i-1] < prices[i] )
            {
                    totalProfit += prices[i] - prices[i-1];
            }
        }
        return totalProfit;
    }
}
