class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int ans=0;
        int xor=0;
        
        for(int i=0;i<arr.length;i++){
             if(i<k){
                 xor=xor^arr[i];
                 if(i==k-1)ans=Math.max(ans,xor);
                 continue;
             }
               xor=xor^arr[i-k]^arr[i];
               ans=Math.max(ans,xor);
        }
        
        return ans;
    }
}
