package GFG160Challenge.Searching;

public class Solution029
{
    public int findMin(int[] arr)
    {

        for(int i = 0 ; i < arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
                return arr[i+1];
        }
        return arr[0];
    }
}
