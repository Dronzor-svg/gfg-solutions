class Solution {
    public int maxWater(int arr[]) {
        // code here
        int lmax=0;
        int total=0;
        int rmax=0;
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            if(arr[left]<=arr[right])
            {
                if(lmax>arr[left]) total+=lmax-arr[left];
                else lmax=arr[left];
                left++;
            }
            else
            {
                if(rmax>arr[right]) total+=rmax-arr[right];
                else rmax=arr[right];
                right--;
            }
        }
        return total;
    }
}
