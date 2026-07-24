class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int org = n;
        int res=0;
      //  int dig = n%10;
        
        while(n !=0){
            int dig = n%10;
            res = res * 10 + dig;
            n /=10;
        }
        return org == res;
    }
}