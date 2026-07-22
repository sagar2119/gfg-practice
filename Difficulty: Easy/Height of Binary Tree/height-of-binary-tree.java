/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root) {
        if(root==null) return -1;
        return 1+Math.max(height(root.left),height(root.right));
    
    }
}