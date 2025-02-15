package GFG160Challenge.Hashing;
import java.util.Arrays;

public class Solution042Approach1
{
    boolean twoSum(int arr[], int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while(left<right)
        {
            if(target == (arr[left] + arr[right]))
            {
                return true;
            }
            else if(target > (arr[left]+arr[right]))
                left++;
            else
                right--;
        }

        return false;
    }
}
