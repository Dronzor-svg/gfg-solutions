class Solution {
    static int perfectSum(int[] arr, int target) {
        // code here
        int n=arr.length;
        int[][] t=new int[n+1][target+1];
        
        t[0][0]=1;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=target;j++)
            {
                if(arr[i-1]<=j)
                {
                    t[i][j]=t[i-1][j-arr[i-1]] + t[i-1][j];
                }
                else
                {
                    t[i][j]=t[i-1][j];
                }
                
            }
        }
        
        return t[n][target];
    }
}