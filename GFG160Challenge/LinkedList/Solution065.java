package GFG160Challenge.LinkedList;

public class Solution065
{
    public static class Node
    {
        int data;
        Node next;
    }

    Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node forward;

        while(current!=null)
        {
            forward = current.next;
            current.next= prev;
            prev=current;
            current=forward;
        }

        head=prev;
        return head;
    }
}
