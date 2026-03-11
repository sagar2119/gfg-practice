class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        Stack<Integer> stack=new Stack<>();
       if(k>q.size()) return q;
       for(int i=0;i<k;i++){
           stack.push(q.remove());}
       while(!stack.isEmpty()){
           q.add(stack.pop());
           
       }
       int size = q.size();
       for(int i=0;i<size-k;i++){
           q.add(q.remove());
       }
        return q;
    }
}