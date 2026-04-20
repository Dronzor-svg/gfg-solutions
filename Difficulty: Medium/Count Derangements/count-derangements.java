class Solution {
    public int helper(int n)
    {
        if(n==1)
            return 0;
        if(n==2)
            return 1;
        return (n-1)*(helper(n-1) + helper(n-2));
    }
    public int derangeCount(int n) {
        return helper(n);
        
    }
}