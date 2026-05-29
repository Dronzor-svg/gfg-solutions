class Solution {
    long[][] dp;

    private long dfs(String s, int idx, int prevSum) {
        if (idx == s.length()) {
            return 1;
        }

        if (dp[idx][prevSum] != -1) {
            return dp[idx][prevSum];
        }

        long ans = 0;
        int sum = 0;

        for (int i = idx; i < s.length(); i++) {
            sum += s.charAt(i) - '0';

            if (sum >= prevSum) {
                ans += dfs(s, i + 1, sum);
            }
        }

        return dp[idx][prevSum] = ans;
    }

    public int validGroups(String s) {
        int maxSum = 9 * s.length();

        dp = new long[s.length()][maxSum + 1];

        for (int i = 0; i < s.length(); i++) {
            Arrays.fill(dp[i], -1);
        }

        return (int) dfs(s, 0, 0);
    }
}