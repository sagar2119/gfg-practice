/*
class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public void deleteNode(Node del) {
        // code here
        del.data=del.next.data;
        del.next=del.next.next;
    }
}