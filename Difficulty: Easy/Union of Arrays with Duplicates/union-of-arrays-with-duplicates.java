class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
          Set<Integer> set = new HashSet<>();
        for(int n : a)
            set.add(n);
        for(int n : b)
            set.add(n);
        ArrayList<Integer> list = new ArrayList<>(set);
        return list;
    }
}