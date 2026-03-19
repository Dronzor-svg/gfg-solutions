class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int sum=0;
        int n=arr.length;
        int[] nums1=new int[n];
        int[] nums2=new int[n];
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            nums1[i]=sum;
        }
        sum=0;
        for(int i=n-1;i>=0;i--)
        {
            sum+=arr[i];
            nums2[i]=sum;
        }
        for(int i=0;i<n;i++)
        {
            if(nums1[i]==nums2[i])
            {
                return i;
            }
        }
        return -1;
        
        
    }
}
