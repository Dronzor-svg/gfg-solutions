class Solution {
    public int maxPathSum(int[] a, int[] b) {
         int i = 0, j = 0;
        int pref1 = 0, pref2 = 0;
        int ans = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                pref1 += a[i];
                i++;
            }
            else if (b[j] < a[i]) {
                pref2 += b[j];
                j++;
            }
            else {
                ans += Math.max(pref1, pref2) + a[i];
                pref1 = 0;
                pref2 = 0;
                i++;
                j++;
            }
        }

        while (i < a.length) {
            pref1 += a[i];
            i++;
        }

        while (j < b.length) {
            pref2 += b[j];
            j++;
        }

        ans += Math.max(pref1, pref2);

        return ans;
    }
};