public class Solution1 {
    public int getSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for(int element:arr)
        {
            if(element > largest)
            {
                secondLargest = largest;
                largest = element;
            }
            else if(element > secondLargest && element!=largest)
            {
                secondLargest = element;
            }
        }

        if(secondLargest == Integer.MIN_VALUE)
            return -1;
        return secondLargest ;
    }
}