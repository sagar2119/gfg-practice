class Solution {
    public ArrayList<String> generateBinary(int n) {
        ArrayList<String> arr= new ArrayList<>();
        // code here
        Queue<String> q= new LinkedList<>();
        q.add("1");
        
        for(int i=0; i<n;i++){
        String curr= q.remove();
        arr.add(curr);
        
        q.add(curr+"0");
        q.add(curr + "1");
        
        }
        return arr;
    }
}
