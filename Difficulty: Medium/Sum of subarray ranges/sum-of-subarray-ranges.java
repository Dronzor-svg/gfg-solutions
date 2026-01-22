class Solution {
    public int subarrayRanges(int[] arr) {
        // code here
        
        int n = arr.length;
        long sumMax = 0, sumMin = 0;

        // ---------- SUM OF SUBARRAY MINIMUMS ----------
        Stack<Integer> st = new Stack<>();
        int[] leftMin = new int[n];
        int[] rightMin = new int[n];

        // previous smaller
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) st.pop();
            leftMin[i] = st.isEmpty() ? i + 1 : i - st.peek();
            st.push(i);
        }

        st.clear();

        // next smaller or equal
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            rightMin[i] = st.isEmpty() ? n - i : st.peek() - i;
            st.push(i);
        }

        for (int i = 0; i < n; i++) {
            sumMin += (long) arr[i] * leftMin[i] * rightMin[i];
        }

        // ---------- SUM OF SUBARRAY MAXIMUMS ----------
        st.clear();
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // previous greater
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) st.pop();
            leftMax[i] = st.isEmpty() ? i + 1 : i - st.peek();
            st.push(i);
        }

        st.clear();

        // next greater or equal
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) st.pop();
            rightMax[i] = st.isEmpty() ? n - i : st.peek() - i;
            st.push(i);
        }

        for (int i = 0; i < n; i++) {
            sumMax += (long) arr[i] * leftMax[i] * rightMax[i];
        }

        return (int) (sumMax - sumMin);
    }
}
