package GFG160Challenge.Hashing;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class Solution045
{
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        HashSet<Integer> resultantSet = new HashSet<>();

        for (int element : a)
            hs1.add(element);

        for (int element : b)
            hs2.add(element);

        Iterator<Integer> iterator = hs1.iterator();

        while (iterator.hasNext()) {
            int element = iterator.next();
            if (!resultantSet.contains(element)) {
                if (hs2.contains(element))
                    resultantSet.add(element);
            }
        }

        iterator = resultantSet.iterator();

        while (iterator.hasNext()) {
            al.add(iterator.next());
        }


        return al;
    }
}