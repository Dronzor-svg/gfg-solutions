class Solution {
    
    
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n=val.length;
        
        int t[][]=new int[n+1][W+1];
        
        for(int i=0;i<=n;i++)
        {
            Arrays.fill(t[i],-1);
        }
        int ans=helper(W,val,wt,n,t);
        
        return ans;
        
    }
    
    int helper(int W,int val[],int wt[] , int n, int[][] t)
    {
        if(n==0 || W==0) return 0;
        
        if(t[n][W]!=-1)
        {
            return t[n][W];
        }
        if(wt[n-1]<=W)
        {
            return t[n][W]=Math.max(val[n-1]+helper(W-wt[n-1],val,wt,n-1,t),helper(W,val,wt,n-1,t));
            
            
        }
        
        else if(wt[n-1]> W)
        {
            return t[n][W]=helper(W,val,wt,n-1,t);
        }
        return 0;
    }
}
