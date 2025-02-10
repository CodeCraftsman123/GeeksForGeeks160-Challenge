package GFG160Challenge.LinkedList;

public class Solution072
{
    public static class Node
    {
        int data;
        Node next;
    }
    public static Node findFirstNode(Node head) {
        Node slow, fast;
        slow = fast = head;
        boolean isCycle = false;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                isCycle=true;
                break;
            }
        }

        if(isCycle)
        {
            slow = head;
            Node prev;
            while(slow!=fast)
            {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        else
            return null;
    }
}
