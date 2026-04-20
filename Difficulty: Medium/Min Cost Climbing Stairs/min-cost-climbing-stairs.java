//Back-end complete function Template for Java

class Solution {
    static int minCostClimbingStairs(int[] cost) {
        // Write your code here
        int n=cost.length;
        int[] dp=new int[n+1];
        for(int i=0;i<n;i++)
        {
            dp[i]=-1;
        }
        
        int ans=Math.min(solve(cost,n-1,dp),solve(cost,n-2,dp));
        return ans;
    }
    static int solve(int[] cost,int n,int[] dp)
    {
        if(n==0) return cost[0];
        if(n==1) return cost[1];
        if(dp[n]!=-1) return dp[n];
        
        dp[n]=cost[n]+Math.min(solve(cost,n-1,dp),solve(cost,n-2,dp));
        return dp[n];
    }
};