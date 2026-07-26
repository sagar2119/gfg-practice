class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        if (n<=0) return new int[0];
        
        int[] result = new int[n];
        result[0]=0;
        if(n==1) return result;
        result[1]=1;
        for(int i=2;i<n ;i++){
            
         result[i]= result[i-1] + result[i-2];
        }
        return result;
    }
}