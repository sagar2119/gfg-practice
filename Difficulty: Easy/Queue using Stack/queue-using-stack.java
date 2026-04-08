class myQueue {

    
    Stack<Integer> st = new Stack<>();
    void enqueue(int x) {
        Stack<Integer> bt=new Stack<>();
        while(st.size()!=0) bt.push(st.pop());
        st.push(x);
        while(bt.size()!=0) st.push(bt.pop());
    }

    void dequeue() {
        st.pop();
    }

    int front() {
        if(st.size()==0) return -1;
        return st.peek();
    }

    int size() {
        return st.size();
    }
}
