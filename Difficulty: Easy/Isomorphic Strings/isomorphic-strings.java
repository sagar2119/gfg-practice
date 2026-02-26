class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character, Character> m1=new HashMap<>();
        HashMap<Character, Character> m2=new HashMap<>();
        for(int i = 0; i<s1.length();i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(m1.containsKey(c1)){
                if(m1.get(c1) !=c2) return false;
                
            }else{
                if(m2.containsKey(c2)) return false;
                m1.put(c1,c2);
                m2.put(c2, c1);
            }
        }
        return true;
    }
}