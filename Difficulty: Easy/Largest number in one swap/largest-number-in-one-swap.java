class Solution {

    public String largestSwap(String s) {

        char[]c=s.toCharArray();

        char maxDigit=0;int maxIdx=-1,l=-1,r=-1;

        for(int i=c.length-1;i>=0;i--){

            if(c[i]>maxDigit){

                maxDigit=c[i];

                maxIdx=i;

                continue;

                

            }

            if(c[i]<maxDigit){

                l=i;

                r=maxIdx;

            }

        }

        if(l==-1) return s;

        char t=c[l];

        c[l]=c[r];

        c[r]=t;

        return new String(c);

        

    }

}