class Solution {
    public int countKdivPairs(int[] arr, int k) {
        // code here
        int cnt=0;
        
        int[] freq=new int[k];
        
        for(int num  : arr)
        {
            int rem=num%k;
            int need=(k-rem)%k;
            
            cnt+=freq[need];
            freq[rem]++;
        }
        return cnt;
    }
}