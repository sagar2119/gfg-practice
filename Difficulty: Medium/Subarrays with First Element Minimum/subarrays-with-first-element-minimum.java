class Solution {
    public int countSubarrays(int[] arr) {
        // code here
        
        int n=arr.length;
        int []next=new int[arr.length];
        
        for(int i=0;i<n;i++){
            next[i]=n;
        } 
        Stack<Integer>st=new Stack<>();
        
        for(int i=arr.length-1;i>=0;i--){
            
              int x=arr[i];
              while(st.size()>0 && arr[st.peek()]>=x)st.pop();
              if(st.size()!=0)next[i]=st.peek();
              st.add(i);
              
        }
        
        int ans=0;
        
        for(int i=0;i<n;i++){
             ans+=(next[i]-i);
        }
        
        return ans;
    }
}