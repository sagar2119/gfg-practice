class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
        int n = s.size();
        deleteMiddle(s, n/2);
        
    }
    void deleteMiddle(Stack<Integer> s, int k){
        if(k==0){
            s.pop();
            return;
        }
        int temp =s.pop();
        deleteMiddle(s, k-1);
        s.push(temp);
    }
}