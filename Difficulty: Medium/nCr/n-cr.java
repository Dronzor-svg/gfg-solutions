class Solution {
    public int nCr(int n, int r) {
        // code here
        long ans=1;
        if(r>n) return 0;
        if(r==0 || r==n) return 1;
        for(int i=0;i<r;i++)
        {
            ans=ans*(n-i);
            ans/=(i+1);
        }
        
        return (int)ans;
    }
}