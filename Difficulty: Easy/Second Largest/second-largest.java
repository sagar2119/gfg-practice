class Solution {
    public int getSecondLargest(int[] arr) {
        // CODE HERE
        int largest =Integer.MIN_VALUE;
        int secLargest= Integer.MIN_VALUE;
        for(int x : arr){
            if(x>largest){
                secLargest = largest;
                largest = x;
            }
            else if(x > secLargest && x !=largest){
                secLargest = x;
            }
        }
        return (secLargest==Integer.MIN_VALUE)? -1:secLargest;
    }
}