/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
} */

class Solution {
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
    ArrayList<Node> inordlist = new ArrayList<>();
    inorder(root, inordlist);
    Node pred = null, succ = null;
    for(int i=0;i<inordlist.size();i++){
        if(inordlist.get(i).data<key){
            pred = inordlist.get(i);
        }
        if(inordlist.get(i).data> key && succ==null){
            succ = inordlist.get(i);
        }
        
        
        
    }
    ArrayList<Node> res = new ArrayList<>();
    res.add(pred);
    res.add(succ);
    return res;
    
    

    }
    private void inorder(Node node,ArrayList<Node> list){
        if(node == null)
        return;
    inorder(node.left, list);
    list.add(node);
    inorder(node.right,list);
    }
}