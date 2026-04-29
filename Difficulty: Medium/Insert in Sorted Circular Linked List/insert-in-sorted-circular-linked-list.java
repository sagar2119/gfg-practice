class Solution {
    public Node sortedInsert(Node head, int data) {
        Node n=new Node(data);
        if(head==null){
            n.next=n;
            return n;
        }
        Node tail=head;
        while(tail.next!=head) tail=tail.next;
        tail.next=null;
        if(data<head.data){
            n.next=head;
            head=n;
        }
        else{
            Node temp=head;
            while(temp.next!=null && temp.next.data<data){
                temp=temp.next;
            }
            n.next=temp.next;
            temp.next=n;
        }
        tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=head;
        return head;
        
        
    }
    
}