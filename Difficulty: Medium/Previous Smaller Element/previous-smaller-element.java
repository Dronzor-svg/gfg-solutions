class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && st.peek()>=arr[i]) st.pop();
            list.add(st.isEmpty() ? -1 : st.peek());
            st.push(arr[i]);
        }
        return list;
    }
}