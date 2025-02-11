package GFG160Challenge.Tree;

public class Solution081
{
    public static class Node
    {
        int data;
        Node left;
        Node right;
    }
    int height(Node node) {
        if(node == null)
            return -1;
        int lst = height(node.left);
        int rst = height(node.right);
        return Math.max(lst,rst)+1;
    }
}
