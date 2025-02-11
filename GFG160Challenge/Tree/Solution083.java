package GFG160Challenge.Tree;

public class Solution083
{
    public static class Node
    {
        int data;
        Node left;
        Node right;
    }
    void mirror(Node node) {
        if(node!=null)
        {
            Node temp =node.left;
            node.left = node.right;
            node.right = temp;
            mirror(node.left);
            mirror(node.right);
        }
    }
}
