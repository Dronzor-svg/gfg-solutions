class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();

        // Step 1: build NGE array
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            nge[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        // Step 2: sliding window using jumps
        for (int i = 0; i <= n - k; i++) {
            int j = i;
            while (nge[j] < i + k) {
                j = nge[j];
            }
            ans.add(arr[j]);
        }

        return ans;
    }
}
