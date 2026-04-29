/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        Node fast=head;
        Node prev=null;
        Node slow = head;
        if(head==null || head.next==null)
            return null;
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        prev.next=slow.next;
        return head;
    }
}