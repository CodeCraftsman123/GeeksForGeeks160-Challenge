package GFG160Challenge.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Solution080
{
    public static class Node
    {
        int data;
        Node left;
        Node right;
    }
    public ArrayList<ArrayList<Integer>> levelOrder(Node ROOT) {
       if(ROOT == null)
            return new ArrayList<ArrayList<Integer>>();
        
        ArrayList<ArrayList<Integer>>levelOrderTraversal = new ArrayList<>();
        Queue<Node>queue = new LinkedList<>();
        ArrayList<Integer>al = new ArrayList<>();
        
        queue.add(ROOT);
        queue.add(null);
        
        while(!queue.isEmpty())
        {
            Node removedElement = queue.poll();
            if(removedElement == null)
            {
                queue.add(null);
                levelOrderTraversal.add(al);
                al = new ArrayList<>();
                if(queue.size() == 1)
                    break;
            }
            else 
            {
                al.add(removedElement.data);
                if(removedElement.left!=null)
                    queue.add(removedElement.left);
                if(removedElement.right!=null)
                    queue.add(removedElement.right);
            }
        }
        
        return levelOrderTraversal;
    }
}