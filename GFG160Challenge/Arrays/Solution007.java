package GFG160Challenge.Arrays;

public class Solution007 
{
    public int maximumProfit(int prices[]) 
    {
        int profit = 0;
        for(int i = 0 ; i < prices.length - 1 ; i++)
        {
            if(prices[i]<prices[i+1])
                profit += (prices[i+1] - prices[i]);
        }
        
        return profit;
    }
}