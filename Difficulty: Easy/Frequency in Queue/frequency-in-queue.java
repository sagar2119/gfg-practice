class Geeks {
    static void enqueue(Queue<Integer> q, int k) {
        //  code here
        q.add(k);
    }

    static int findFrequency(Queue<Integer> q, int k) {
    int count =0;
    int n=q.size();
    for(int i=0;i<n;i++){
        int ele=q.remove();
        if(ele==k) count++;
        q.add(ele);
    }
        return count;
        //  code here
    }
}