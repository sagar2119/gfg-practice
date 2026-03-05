class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int n = s.length();
        HashMap<Character,Integer> hm = new HashMap<>();
        int l=0;
        int maxi = -1;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
            while(hm.size()>k){
                char ch = s.charAt(l);
                l++;
                int freq = hm.get(ch);
                hm.put(ch,freq-1);
                if(hm.get(ch)==0) hm.remove(ch);
            }
            if(hm.size()==k)maxi = Math.max(maxi,i-l+1);
        }
        return maxi;
    }
}

