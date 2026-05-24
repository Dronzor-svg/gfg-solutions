class Solution {
    public int coin(int[] arr) {
        // code here
        int l=0;
        int r=arr.length-1;
        while(l<r)
        {
            if(arr[l]<arr[r])
            {
                r--;
            }
            else l++;
        }
        if(l==r) return arr[l];
        return arr[l];
    }
}