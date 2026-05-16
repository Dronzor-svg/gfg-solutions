class Solution {
    public int findSmallest(int[] arr) {
        // code here
        Arrays.sort(arr);
        long min=1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>min) break;
            
            else min+=arr[i];
        }
        return (int)min;
    }
}