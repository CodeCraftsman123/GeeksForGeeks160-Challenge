package GFG160Challenge.Hashing;
import java.util.HashSet;

public class Solution042Approach2
{
    boolean twoSum(int arr[], int target) {
        HashSet<Integer>hs = new HashSet<>();
        for(int element:arr)
        {
            int difference = target - element;
            if(hs.contains(difference))
                return true;
            hs.add(element);
        }

        return false;
    }
}
