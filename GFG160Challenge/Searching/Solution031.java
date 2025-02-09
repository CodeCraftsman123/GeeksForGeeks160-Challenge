package GFG160Challenge.Searching;

public class Solution031
{
    public int peakElement(int[] arr)
    {
        if(arr.length == 1)
        {
            if(Integer.MIN_VALUE < arr[0])
                return 0;
        }
        if(arr[0] > arr[1] && arr[0] > Integer.MIN_VALUE)
            return 0;

        for(int i = 0; i < arr.length - 2 ; i++)
        {
            if(arr[i]<arr[i+1] && arr[i+1]>arr[i+2])
                return i+1;
        }

        if(arr[arr.length-2]<arr[arr.length - 1] && arr[arr.length-1] > Integer.MIN_VALUE)
            return arr.length - 1;

        return -1;
    }
}
