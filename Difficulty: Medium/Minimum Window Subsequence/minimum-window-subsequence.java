class Solution {
    public String minWindow(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        
        int i = 0, j = 0;
        int minLen = Integer.MAX_VALUE;
        int start = -1;

        while (i < n) {

            // Step 1: move forward to match s2
            if (s1.charAt(i) == s2.charAt(j)) {
                j++;
                if (j == m) {   // full subsequence found

                    int end = i;
                    j--;        // move to last char of s2

                    // Step 2: move backward to minimize window
                    while (j >= 0) {
                        if (s1.charAt(i) == s2.charAt(j)) {
                            j--;
                        }
                        i--;
                    }

                    i++;  // move to first valid start

                    // Step 3: update best answer
                    if (end - i + 1 < minLen) {
                        minLen = end - i + 1;
                        start = i;
                    }

                    // reset for next search
                    j = 0;
                    i = i + 1;   // continue after this start
                }
            }
            i++;
        }

        return start == -1 ? "" : s1.substring(start, start + minLen);
    }
}
