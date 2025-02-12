package GFG160Challenge.Tree;
import java.util.ArrayList;

public class Solution085
{
    public ArrayList<Integer>al = new ArrayList<>();

    public static class Node
    {
        int data;
        Node left;
        Node right;
    }

    ArrayList<Integer> inOrder(Node ROOT) 
    {
       if(ROOT!=null)
       {
           inOrder(ROOT.left);
           al.add(ROOT.data);
           inOrder(ROOT.right);
       }
       return al;
    }
}
