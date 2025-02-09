package GFG160Challenge.Sorting;
import java.util.LinkedHashMap;

public class Solution021 {
    public void sort012(int[] arr) {
        LinkedHashMap<Integer,Integer>lhm = new LinkedHashMap<>();
        lhm.put(0,0);
        lhm.put(1,0);
        lhm.put(2,0);

        for(int element:arr)
        {
            int numberOfOccurrences = lhm.get(element);
            numberOfOccurrences++;
            lhm.put(element,numberOfOccurrences);
        }

        int indexForArr = 0;
        for(int key:lhm.keySet())
        {
            int numberOfOccurrences = lhm.get(key);
            int i = 0;
            while(i < numberOfOccurrences)
            {
                arr[indexForArr++] = key;
                i++;
            }
        }

    }
}
