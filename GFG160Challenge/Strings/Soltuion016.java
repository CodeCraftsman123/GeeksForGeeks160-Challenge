package GFG160Challenge.Strings;

import java.util.LinkedHashMap;

public class Soltuion016 {
    public static boolean areAnagrams(String s1, String s2) 
    {
        if(s1.length() != s2.length())
            return false;
        else
        {
            LinkedHashMap<Character,Integer>lhmForS1 = new LinkedHashMap<>();
            LinkedHashMap<Character,Integer>lhmForS2 = new LinkedHashMap<>();
            
            for(int i = 0 ; i < s1.length() ; i++)
            {
                char ch = s1.charAt(i);
                if(lhmForS1.containsKey(ch))
                {
                    int value = lhmForS1.get(ch);
                    value++;
                    lhmForS1.put(ch,value);
                }
                else 
                {
                    lhmForS1.put(ch,1);
                }
                ch = s2.charAt(i);
                if(lhmForS2.containsKey(ch))
                {
                    int value = lhmForS2.get(ch);
                    value++;
                    lhmForS2.put(ch,value);
                }
                else
                {
                    lhmForS2.put(ch,1);
                }
                
            }
            
            if(lhmForS1.size() != lhmForS2.size())
                return false;
            else 
            {
                for(char element:lhmForS1.keySet())
                {
                    if(lhmForS2.containsKey(element))
                    {
                        int value1 = lhmForS1.get(element);
                        int value2 = lhmForS2.get(element);
                        if(value1!=value2)
                            return false;
                    }
                    else 
                    {
                        return false;
                    }
                }
                
                return true;
            }
        }
    }
}
