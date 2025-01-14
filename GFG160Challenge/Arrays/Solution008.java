public class Solution008 
{
    public int maximumProfit(int prices[]) 
    {
        int profit = 0, maxProfit = Integer.MIN_VALUE, buyStock = prices[0];
        
        for(int i = 1; i < prices.length ; i++)
        {
            buyStock = Math.min(buyStock,prices[i]);
            profit = prices[i] - buyStock;
            maxProfit = Math.max(profit,maxProfit);
            
        }
        
        if(maxProfit <= 0)
            return 0;
        return maxProfit;
        
    }
}