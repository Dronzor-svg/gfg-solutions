class Solution {
    public int peakElement(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean leftOK  = (i == 0 || arr[i] >= arr[i - 1]);
            boolean rightOK = (i == n - 1 || arr[i] >= arr[i + 1]);

            if (leftOK && rightOK) {
                return i;
            }
        }
        return -1;
    }
}
