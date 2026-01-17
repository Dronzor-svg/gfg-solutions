class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(1);
        long res=1;
        for(int i=1;i<n;i++)
        {
            res=res*(n-i);
            res/=i;
            ans.add((int)res);
        }
        return ans;
    }
}