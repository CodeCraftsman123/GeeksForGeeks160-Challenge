import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution006 {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) 
    {
       LinkedHashMap<Integer,Integer>hm = new LinkedHashMap<>();
       ArrayList<Integer>al = new ArrayList<>();
       
       for(int element:nums)
       {
           if(!al.contains(element))
           {
               if(hm.containsKey(element))
               {
                   int value = hm.get(element);
                   value++;
                   hm.put(element,value);
                   if(value > (nums.length / 3))
                        al.add(element);
               }
               else 
               {
                   hm.put(element,1);
                   if(1 > (nums.length / 3))
                        al.add(element);
               }
           }
       }
       Collections.sort(al);
       
       return al;
    }
}