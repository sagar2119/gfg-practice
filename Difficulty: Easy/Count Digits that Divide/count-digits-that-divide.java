class Solution {
    static int evenlyDivides(int n) {
        int num = n;
        int count =0;
        while(num !=0){
            int dig = num % 10;
            if(dig !=0 && n % dig ==0){
                count++;
            }
            num = num/10;
        }
        return count;
    }
}