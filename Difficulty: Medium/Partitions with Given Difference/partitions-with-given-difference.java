class Solution {
    public int countPartitions(int[] arr, int diff) {
        // code here
        int sumOfArray=0;
        int sum=0;
        for(int x : arr)
        {
            sumOfArray+=x;
        }
        
        if (diff > sumOfArray || (diff + sumOfArray) % 2 != 0) return 0;

        sum=(diff+sumOfArray)/2;
        
        return countOfSubsetSum(arr,sum);
    
        
    }
    
    int countOfSubsetSum(int[] arr,int sum)
    {
        int n=arr.length;
        
        int[][] t=new int[n+1][sum+1];
        
        t[0][0]=1;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=sum;j++)
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
        
        return t[n][sum];
    }
}
