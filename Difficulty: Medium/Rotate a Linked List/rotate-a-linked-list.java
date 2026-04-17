/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        // code 
        if(head == null || head.next==null || k==0)
            return head;
        Node tail = head;
        int n =1;
        while(tail.next != null){
            tail = tail.next;
            n++;
        }
        k= k%n;
        if(k == 0)
            return head;
        tail.next = head;
        Node newTail = head;
        
        for(int i =1; i<k;i++){
            newTail = newTail.next;
        }
        Node newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}