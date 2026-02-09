class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int start=0;
        int end=arr.length-1;
        int ans=0;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==1)
            {
                ans=mid;
                break;
            }
            else if(arr[mid]>arr[arr.length-1]) start=mid+1;
            else
            {
                ans=mid;
                end=mid-1;
            }
            
        }
        return ans;
    }
}