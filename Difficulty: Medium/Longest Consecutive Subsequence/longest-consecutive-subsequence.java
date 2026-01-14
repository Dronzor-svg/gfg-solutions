class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        if(arr.length==0) return 0;
        Arrays.sort(arr);
        int longest=0;
        int count=0;
        int lastSmallest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]-1==lastSmallest)
            {
                count++;
                lastSmallest=arr[i];
            }
            else if(arr[i]!=lastSmallest)
            {
                count=1;
                lastSmallest=arr[i];
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
}