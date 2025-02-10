package GFG160Challenge.LinkedList;

public class Solution071
{
    public static class Node
    {
        int data;
        Node next;
    }
    public static boolean detectLoop(Node head) {
        Node slow, fast;
        slow = fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }

        return false;
    }
}
