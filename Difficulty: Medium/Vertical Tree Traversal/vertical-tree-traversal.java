import java.util.*;

class Solution {

    static class Pair {
        Node node;
        int hd;

        Pair(Node n, int h) {
            node = n;
            hd = h;
        }
    }

    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        if (root == null) return res;

        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {

            Pair p = q.poll();
            Node node = p.node;
            int hd = p.hd;

            map.putIfAbsent(hd, new ArrayList<>());
            map.get(hd).add(node.data);

            if (node.left != null)
                q.add(new Pair(node.left, hd - 1));

            if (node.right != null)
                q.add(new Pair(node.right, hd + 1));
        }

        for (ArrayList<Integer> list : map.values()) {
            res.add(list);
        }

        return res;
    }
}