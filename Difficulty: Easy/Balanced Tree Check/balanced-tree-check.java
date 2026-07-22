/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBalanced(Node root) {
       return height_check(root) != -1;
        
    }
    private int height_check(Node node){
        if(node == null)return 0;
        int left_height = height_check(node.left);
        if(left_height == -1) return -1;
        int right_height= height_check(node.right);
        if(right_height == -1) return -1;
        
        if(Math.abs(left_height - right_height )>1) return -1;
        return 1 + Math.max(left_height, right_height);
    }
}