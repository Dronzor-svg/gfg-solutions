class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int total=0;
        int partial=0;
        for(int i=0;i<arr.length;i++)
        {
            total+=arr[i];
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            partial+=arr[i];
            
            total-=arr[i];
            if(partial==total) return true;
            
        }
        return false;
    }
}