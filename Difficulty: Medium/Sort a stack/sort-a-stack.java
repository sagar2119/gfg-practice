class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty()) return;
        int x= st.pop();
        sortStack(st);
        sortedInsert(st, x);
        
    }
    void sortedInsert(Stack<Integer> st, int x){
        if(st.isEmpty()|| st.peek()<=x){
            st.push(x);
            return;
        }
        int temp=st.pop();
        sortedInsert(st,x);
        st.push(temp);
    }
}