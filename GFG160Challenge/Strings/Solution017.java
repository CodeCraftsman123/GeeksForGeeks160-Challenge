package GFG160Challenge.Strings;

import java.util.LinkedHashMap;

public class Solution017 
{
    static char nonRepeatingChar(String s)
    {
        // Your code here
        LinkedHashMap<Character,Integer>lhm = new LinkedHashMap<>();
        
        for(int i = 0; i < s.length() ; i++)
        {
            if(lhm.containsKey(s.charAt(i)))
            {
                int value = lhm.get(s.charAt(i));
                value++;
                lhm.put(s.charAt(i),value);
            }
            else
                lhm.put(s.charAt(i),1);
        }
        
        for(char element:lhm.keySet())
        {
            if(lhm.get(element) == 1)
                return element;
        }
        
        return '$';
        
    }
}
