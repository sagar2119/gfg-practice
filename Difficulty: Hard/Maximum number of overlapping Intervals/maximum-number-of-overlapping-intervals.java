class Solution {
    public static int overlapInt(int[][] arr) {
        
        int n = arr.length;
        
        
        int start[] = new int[n];
        int end[] = new int[n];
        for(int i = 0;i < n;i++){
            start[i] = arr[i][0];
            end[i] = arr[i][1];
        }
        
        //Sort them
        Arrays.sort(start);
        Arrays.sort(end);
        
        int curr = 0, res = 0, i = 0, j = 0;
        while(i < n && j < n){
            if(start[i] <= end[j]){
               curr++;
                res = Math.max(res, curr);
                i++;
            }
            else{
                 curr--;
                j++;
            }
        }
        
        //Return result
        return res;
    }
}