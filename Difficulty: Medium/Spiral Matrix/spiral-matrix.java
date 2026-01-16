class Solution {

    public int findK(int a[][], int n, int m, int k) {

        int left = 0;
        int right = m - 1;
        int top = 0;
        int bottom = n - 1;

        int count = 0;

        while (left <= right && top <= bottom) {

            // top row
            for (int i = left; i <= right; i++) {
                count++;
                if (count == k) return a[top][i];
            }
            top++;

            // right column
            for (int i = top; i <= bottom; i++) {
                count++;
                if (count == k) return a[i][right];
            }
            right--;

            // bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    count++;
                    if (count == k) return a[bottom][i];
                }
                bottom--;
            }

            // left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    count++;
                    if (count == k) return a[i][left];
                }
                left++;
            }
        }
        return -1;
    }
}
