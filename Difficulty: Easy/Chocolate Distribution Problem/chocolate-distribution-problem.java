// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        int count=0;
        Collections.sort(arr);
        count=arr.get(m-1)-arr.get(0);
        int a=1;
        for(int i=m;i<arr.size();i++)
        {
            count=Math.min(count,arr.get(i)-arr.get(a));
            a++;
        }
        return count;
    } 
}