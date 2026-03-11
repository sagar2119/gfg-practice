class Solution {
    public int sumSubMins(int[] arr) {
        // code here
        int n = arr.length;
        int[] ple = new int[n];
        int[] nle = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]){
                stack.pop();
                
            }
            if(stack.isEmpty())
                ple[i]=i+1;
                else
                ple[i]=i-stack.peek();
                stack.push(i);
        }
        stack.clear();
        for(int i =n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
                
            }
            if(stack.isEmpty())
                nle[i]=n-i;
            else
            nle[i]=stack.peek() -i;
            stack.push(i);
            
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i]*nle[i]*ple[i];
        }
        return sum;
    }
}
