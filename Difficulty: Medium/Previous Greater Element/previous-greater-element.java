class Solution {
    static ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && st.peek()<=arr[i]) st.pop();
            list.add(st.isEmpty() ? -1 : st.peek());
            st.push(arr[i]);
        }
        return list;
    }
}