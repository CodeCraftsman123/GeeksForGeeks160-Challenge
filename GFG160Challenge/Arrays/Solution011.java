package GFG160Challenge.Arrays;

public class Solution011 
{
    // Function to find maximum product subarray
    int maxProduct(int[] arr) 
    {
        int prefix = 1, suffix = 1, maxProduct = Integer.MIN_VALUE;
        
        for(int i =0 ; i < arr.length ; i++)
        {
            if(prefix == 0)
                prefix = 1;
                
            if(suffix == 0)
                suffix = 1;
                
            suffix *= arr[arr.length - i - 1];
            prefix *= arr[i];
            
            maxProduct = Math.max(maxProduct,Math.max(prefix,suffix));
        }
        
        return maxProduct;
    }
}