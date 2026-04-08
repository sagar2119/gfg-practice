class Solution {
    public static int distributeTicket(int n, int k) {
        // code here
        int f=1;
        int r = n;
        while(f<=r) {
            if(f+k-1>=r) return r;
            f=f+k;
            if(r-k+1<=f) return f;
            r=r-k;
        }
    return f;
        
    }
}