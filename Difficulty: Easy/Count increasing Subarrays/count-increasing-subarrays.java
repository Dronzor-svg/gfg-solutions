class Solution {
    public int countIncreasing(int[] arr) {
        // code here
        int a=0;
        int cnt=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[a]<arr[i] && arr[i-1]<arr[i]) cnt+=i-a;
            else if(arr[i-1]>=arr[i]) a=i;
        }
        return cnt;
    }
}
