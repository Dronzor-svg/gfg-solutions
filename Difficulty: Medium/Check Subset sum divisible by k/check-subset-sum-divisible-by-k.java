class Solution {
    public boolean divisibleByK(int[] arr, int k) {
        int n = arr.length;
        int[][]dp = new int[n][k +1];
        for(int[] d: dp) Arrays.fill(d, -1);
        
        boolean res = func(0, arr, 0, k, 0, dp);
        return res ? true : false;
    }
    
    boolean func(int ind, int[] arr, int sum,  int k, int picked, int[][] dp) {
        if(sum % k == 0 && picked > 0) return true;
        if(ind == arr.length) return false;
        if(dp[ind][sum] != -1) return dp[ind][sum] == 1 ? true :false;
        boolean notTake = func(ind +1, arr, sum, k, picked, dp);
        boolean take = func(ind+1, arr, (sum + arr[ind]) % k, k, picked + 1, dp);
        boolean temp = take | notTake;
        dp[ind][sum] = temp ? 1 : 0;
        return temp;
    } 
}