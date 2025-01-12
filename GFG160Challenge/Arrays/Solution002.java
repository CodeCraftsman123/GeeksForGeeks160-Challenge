public class Solution002
{
    void pushZerosToEnd(int[] arr)
    {
        int index= 0;
        for(int element:arr)
        {
            if(element!=0)
            {
                arr[index]=element;
                index++;
            }
        }

        while(index<arr.length)
        {
            arr[index] = 0;
            index++;
        }
    }
}