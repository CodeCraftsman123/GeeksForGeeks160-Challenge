package GFG160Challenge.Hashing;
import java.util.HashSet;

public class Solution046
{
    public static int findUnion(int a[], int b[]) {
        HashSet<Integer>hs = new HashSet<>();

        for(int element:a)
            hs.add(element);

        for(int element:b)
            hs.add(element);

        return hs.size();
    }
}
