/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        // code here
        if(head==null||head.next==null)
        return;
        Node slow=head;
        Node fast=head;
        boolean flag=false;
        while(fast!=null &&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                flag=true;
                break;
            }
        }
        if(!flag)
        return;
        slow=head;
        if(slow==fast)
        {
            while(fast.next!=slow)
            {
                fast=fast.next;
            }
            fast.next=null;
            return;
        }
        while(slow.next!=fast.next)
        {
            slow=slow.next;
            fast=fast.next;
            
            }
            
            
            fast.next=null;
        
        
    }
}