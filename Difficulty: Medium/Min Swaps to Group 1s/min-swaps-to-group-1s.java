class Solution {
    public int minSwaps(int[] arr) {
        // code here
        int cnt1=0;
        int cnt0=0;
        int end=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1) cnt1++;
        }
        if(cnt1==0)
        {
            return -1;
        }
        
        for(int i=0;i<cnt1;i++)
        {
            if(arr[i]==0)
            {
                cnt0++;
            }
        }
        int minswaps=cnt0;
        
        for(int i=cnt1;i<arr.length;i++)
        {
            if(arr[i-cnt1]==0) cnt0--;
            
            if(arr[i]==0) cnt0++;
            
            minswaps=Math.min(minswaps,cnt0);
        }
        return minswaps;
    }
}
