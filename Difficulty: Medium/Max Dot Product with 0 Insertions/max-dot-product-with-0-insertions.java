class Solution {
    public int maxDotProduct(int[] a, int[] b) {
        // code here
         int n = a.length;

        int m = b.length;

        

        

        int[] dp = new int[m + 1];

        

        for (int i = 1; i <= n; i++) {

           

            int prevDiagonal = dp[0]; 

            

            for (int j = 1; j <= m; j++) {

                

                int temp = dp[j]; 

                

                if (i == j) {

                    dp[j] = a[i - 1] * b[j - 1] + prevDiagonal;

                } else if (i > j) {

                    dp[j] = Math.max(a[i - 1] * b[j - 1] + prevDiagonal, dp[j]);

                }

                

                // Update prevDiagonal for the next iteration of 'j'

                prevDiagonal = temp; 

            }

        }

        

        return dp[m];

    }

}