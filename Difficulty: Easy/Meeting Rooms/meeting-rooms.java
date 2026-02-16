import java.util.*;
class Solution {
    static boolean canAttend(int[][] arr) {
        // code 
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] < arr[i - 1][1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] arr = { {1, 4}, {10, 15}, {7, 10} };

        System.out.println(canAttend(arr));
    }
}
