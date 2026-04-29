class Solution {
    public int countPairs(Node head1, Node head2, int x) {
        int count=0;
        HashSet<Integer> s1=new HashSet<>();
        Node temp1=head1;
        Node temp2=head2;
        while(temp1!=null){
            s1.add(temp1.data);
            temp1=temp1.next;
        } 
        while(temp2!=null){
            if(s1.contains(x-temp2.data)) count++;
            temp2=temp2.next;
        }
        return count;
    }
}