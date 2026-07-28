class Solution {
    public static ArrayList<Integer> primeFac(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i =2; i*i<=n;i++){
            if(n%i==0){
                res.add(i);
                while(n%i==0){
                    n/=i;
                }
            }
        }
        if(n>1){
            res.add(n);
        }
        return res;
    }
}