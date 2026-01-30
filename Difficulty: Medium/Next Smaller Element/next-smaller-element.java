class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek()>=arr[i]) st.pop();
            list.add(st.isEmpty() ? -1 : st.peek());
            st.push(arr[i]);
            
        }
        Collections.reverse(list);
        return list;
    }
}