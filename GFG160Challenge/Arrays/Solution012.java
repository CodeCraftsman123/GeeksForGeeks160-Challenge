package GFG160Challenge.Arrays;

public class Solution012 {
    public int circularSubarraySum(int arr[]) 
    {
        int totalSum = 0, maxSum = Integer.MIN_VALUE, curMax = 0;
        int minSum = Integer.MAX_VALUE, curMin = 0;
        
        for(int element:arr)
        {
            curMax += element;
            maxSum = Math.max(maxSum,curMax);
            curMax = Math.max(0,curMax);
            
            curMin += element;
            minSum = Math.min(curMin,minSum);
            curMin = Math.min(0,curMin);
            
            totalSum += element;
        }
        
        return (maxSum > 0)?Math.max(maxSum,totalSum - minSum):maxSum;
        
    }
}
