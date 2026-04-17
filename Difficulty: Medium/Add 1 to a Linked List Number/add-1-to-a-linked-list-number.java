/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
    head = reverse(head);
    Node curr = head;
    int c = 1;
    while(curr!=null){
        int sum=curr.data+c;
        curr.data= sum%10;
        c=sum/10;
        if(c==0) break;
        if(curr.next == null & c!=0){
            curr.next = new Node(c);
            c=0;
            break;
        }
        curr = curr.next;
         }
         return reverse(head);
}
private Node reverse(Node head){
     // code here
        Node temp = head;
        Node next = null;
        Node prev = null;
        while(temp!=null){
            prev = temp.next;
            temp.next = next;
            next = temp;
            temp = prev;
        }
        return next;
    }
}