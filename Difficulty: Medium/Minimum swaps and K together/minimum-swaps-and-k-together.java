class Solution {
    // Function for finding minimum swaps required
    int minSwap(int[] arr, int k) {
        int n = arr.length;

        // Count elements which are less than or equal to k
        int count = 0;
        for (int i = 0; i < n; ++i) {
            if (arr[i] <= k) {
                ++count;
            }
        }

        // Find the number of "bad" elements in the first window of size 'count'
        int bad = 0;
        for (int i = 0; i < count; ++i) {
            if (arr[i] > k) {
                ++bad;
            }
        }

        // Initialize result with the count of "bad" elements in the first window
        int minSwaps = bad;

        // Slide the window over the array
        for (int i = 0, j = count; j < n; ++i, ++j) {
            // Decrement "bad" count if the element leaving the window is bad
            if (arr[i] > k) {
                --bad;
            }

            // Increment "bad" count if the element entering the window is bad
            if (arr[j] > k) {
                ++bad;
            }

            // Update the result to minimum swaps so far
            minSwaps = Math.min(minSwaps, bad);
        }

        return minSwaps;
    }
}