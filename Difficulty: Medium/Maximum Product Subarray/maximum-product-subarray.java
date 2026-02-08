class Solution {
    int maxProduct(int[] arr) {
        // code here
        int maxEnd=arr[0];
        int minEnd=arr[0];
        int maxProd=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            int x=arr[i];
            if(x<0)
            {
                int temp=maxEnd;
                maxEnd=minEnd;
                minEnd=temp;
            }
            maxEnd=Math.max(x,maxEnd*x);
            minEnd=Math.min(x,minEnd*x);
            
            maxProd=Math.max(maxProd,maxEnd);
        }
        return maxProd;
    }
}