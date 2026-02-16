import java.util.*;

class Solution {
    static boolean canAttend(int[][] arr) {
        if (arr.length == 0) return true;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int a = arr[0][1];

        for (int i = 1; i < arr.length; i++) {
            int b = arr[i][0];
            int c = arr[i][1];


            if (b < a) {
                return false;
            }

            a = c;
        }

        return true;
    }
}
