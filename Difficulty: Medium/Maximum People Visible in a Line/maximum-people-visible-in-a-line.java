import java.util.*;

class Solution {
    public int maxPeople(int[] arr) {
        int n = arr.length;

        int[] prevGreater = new int[n];
        int[] nextGreater = new int[n];

        Stack<Integer> st1 = new Stack<>();

        // Previous greater or equal element index
        for (int i = 0; i < n; i++) {
            while (!st1.isEmpty() && arr[st1.peek()] < arr[i]) {
                st1.pop();
            }
            if (st1.isEmpty()) {
                prevGreater[i] = -1;
            } else {
                prevGreater[i] = st1.peek();
            }
            st1.push(i);
        }

        Stack<Integer> st2 = new Stack<>();

        // Next greater or equal element index
        for (int i = n - 1; i >= 0; i--) {
            while (!st2.isEmpty() && arr[st2.peek()] < arr[i]) {
                st2.pop();
            }
            if (st2.isEmpty()) {
                nextGreater[i] = n;
            } else {
                nextGreater[i] = st2.peek();
            }
            st2.push(i);
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int left = nextGreater[i] - i - 1;
            int right = i - prevGreater[i] - 1;
            ans = Math.max(ans, left + right + 1);
        }

        return ans;
    }
}
