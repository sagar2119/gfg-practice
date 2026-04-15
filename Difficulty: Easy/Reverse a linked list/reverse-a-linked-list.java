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
    Node reverseList(Node head) {
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