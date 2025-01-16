package GFG160Challenge.Strings;

import java.util.LinkedHashMap;

public class Solution017 
{
    static char nonRepeatingChar(String s)
    {
        // Your code here
        LinkedHashMap<Character,Integer>lhs = new LinkedHashMap<>();
        
        for(int i = 0; i < s.length() ; i++)
        {
            if(lhs.containsKey(s.charAt(i)))
            {
                int value = lhs.get(s.charAt(i));
                value++;
                lhs.put(s.charAt(i),value);
            }
            else
                lhs.put(s.charAt(i),1);
        }
        
        for(char element:lhs.keySet())
        {
            if(lhs.get(element) == 1)
                return element;
        }
        
        return '$';
        
    }
}
