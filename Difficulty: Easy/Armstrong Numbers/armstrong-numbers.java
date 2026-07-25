class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int org = n;
        int sum =0;
        int digits = String.valueOf(n).length();
        while(n>0){
            int digit = n %10;
            sum += (int)Math.pow(digit,digits);
            n/=10;
        }
        if(sum == org){
            return true;
        }else return false;
    }
}