package _01_Arrays;

public class _39_Buy_And_Sell_Stock
{
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        _39_Buy_And_Sell_Stock obj = new _39_Buy_And_Sell_Stock();
        int ans =  obj.maxProfit(prices);
        System.out.println(ans);
    }

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0;i<n;i++)
        {
            if(prices[i] <  buyPrice)
            {
                buyPrice = prices[i];
            }else{
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit , maxProfit);
            }
        }

        return maxProfit;
    }
}
