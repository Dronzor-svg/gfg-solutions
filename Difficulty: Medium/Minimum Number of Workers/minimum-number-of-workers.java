class Solution {
    public int minMen(int arr[]) {
        // code here
        int n=arr.length;
        int[] temp=new int[n];
        Arrays.fill(temp,-1);
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=-1)
            {
                int idx=Math.max(0,i-arr[i]);
                temp[idx]=Math.max(temp[idx],i+arr[i]);
            }
        }
        int i=0;
        int ans=0;
        int curr=-1;
        int mx=-1;
        while(i<n)
        {
            
            mx=Math.max(mx,temp[i]);
            if(curr<i)
            {
                if(mx<i)
                {
                    return -1;
                    
                }
                else
                {
                    curr=mx;
                    ans++;
                    
                }
            }
            i++;
        }
        if(curr<n-1) return -1;
        
        return ans;
        
    }
}