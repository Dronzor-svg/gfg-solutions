class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        int n=st.size();
        int[] arr=new int[n];
        int i=n-1;
        while(!st.isEmpty())
        {
            arr[i]=st.pop();
            i--;
        }
        
        for(i=n-1;i>=0;i--)
        {
            st.push(arr[i]);
        }

    }
}
