package GFG160Challenge.Arrays;

import java.util.Arrays;
public class Solution013 
{
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr)
    {
        Arrays.sort(arr);
        
        int missingNumber = 1;
        
        for(int element:arr)
        {
            if(element == missingNumber)
            {
                missingNumber++;
            }
            else if(element>missingNumber)
                return missingNumber;
        }
        return missingNumber;
    }
}