class Solution {
    public static int countPairs(int arr[], int k) {
        int n = arr.length;
        if (n < 2) return 0;

        java.util.Arrays.sort(arr);

        int count = 0;
        int left = 0;

        for (int right = 1; right < n; right++) {
            while (arr[right] - arr[left] >= k) {
                left++;
            }
            count += (right - left);
        }

        return count;
    }
}
