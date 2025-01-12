class Solution 
{
    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) 
    {
        int currentSum = 0, maxSum = Integer.MIN_VALUE;
        
        for(int element:arr)
        {
            currentSum += element;
            maxSum = Math.max(currentSum,maxSum);
            if(currentSum < 0)
                currentSum = 0;
        }
        
        return maxSum;
    }
}
