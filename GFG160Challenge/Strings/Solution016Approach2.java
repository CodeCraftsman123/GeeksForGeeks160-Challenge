package GFG160Challenge.Strings;

import java.util.Arrays;

public class Solution016Approach2 {
    public static boolean areAnagrams(String s1, String s2) 
    {
        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();
        
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        if(Arrays.equals(array1,array2))
            return true;
        
        return false;
    }
}
