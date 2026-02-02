class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        // code here
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=2*n-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek()<=arr[i%n]) st.pop();
            if(i<n) 
            {
                list.add(st.isEmpty() ? -1 : st.peek());
            }
            st.push(arr[i%n]);
        }
        Collections.reverse(list);
        return list;
    }
}