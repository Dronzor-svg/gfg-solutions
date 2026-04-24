class Solution {
    public int visibleBuildings(int arr[]) {
        // code here
        int max=Integer.MIN_VALUE;
        int cnt=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=max)
            {
                max=arr[i];
                cnt++;
            }
        }
        return cnt;
    }
}