class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n=arr.length;
        int sum=0;
        int[] nums=new int[n];
        int left=1;
        for(int i=0;i<n;i++)
        {
            nums[i]=1;
        }
        for(int i=0;i<n;i++)
        {
            nums[i]*=left;
            left*=arr[i];
        }
        int right=1;
        for(int i=n-1;i>=0;i--)
        {
            nums[i]*=right;
            right*=arr[i];
        }
        return nums;
    }
}
