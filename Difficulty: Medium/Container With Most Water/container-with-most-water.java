class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int left =0;
        int right=arr.length-1;
        int maxarea=0;
        int area=0;
        while(left<right){
            area = Math.min(arr[left],arr[right])*(right-left);
            if(area>maxarea){
                maxarea=area;
                }else if(arr[left]<arr[right]){
                    left+=1;
                }else{
                    right-=1;
                }
        }
        return maxarea;
    }
}