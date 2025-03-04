class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buys = prices[0];
        for(int i=0; i<prices.length; i++)
        {
            if(prices[i]<buys)
            {
                buys = prices[i];
            }

            else if(prices[i]-buys>profit)
            {
                profit = prices[i]-buys;
            }
            
        }
        return profit;
    }
}