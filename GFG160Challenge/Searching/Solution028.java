package GFG160Challenge.Searching;

public class Solution028
{
    int countFreq(int[] arr, int target) {
        int numberOfOccurrences = 0;
        for(int element:arr)
        {
            if(element == target)
                numberOfOccurrences++;
        }

        return numberOfOccurrences;
    }
}
