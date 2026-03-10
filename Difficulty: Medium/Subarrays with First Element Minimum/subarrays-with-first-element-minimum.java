class Solution {
    public int countSubarrays(int[] arr) {
        // code here
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        st.add(n-1);
        if(n==1 || n==0) return n;
        int ans=1;
        for(int i=n-2;i>=0;i--)
        {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                ans+=n-i;
            }
            else
            {
                ans+=st.peek()-i;
            }
            st.add(i);
        }
        return ans;
    }
}
