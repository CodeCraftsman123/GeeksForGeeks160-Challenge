package GFG160Challenge.Arrays;

public class Solution003
{
    public void reverseArray(int[] arr)
    {
        int start = 0, end = arr.length - 1;


        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}