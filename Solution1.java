import java.util.HashSet;
public class Solution1 {
    public int getSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        HashSet<Integer>hs = new HashSet<>();

        for(int element:arr)
        {
            if(element > largest)
            {
                secondLargest = largest;
                largest = element;
                hs.add(element);
            }
            else if(element > secondLargest && element!=largest)
            {
                secondLargest = element;
                hs.add(element);
            }
        }

        if(hs.size() <= 1)
            return -1;
        return secondLargest ;
    }
}