/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public boolean detectLoop(Node head) {
        // code here
         if(head==null||head.next==null)
        return false;
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
    if(flag == true)
        return true;
    return false;
        
    }}
        
