class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        ArrayList<Integer> nge=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek()<=arr[i]) st.pop();
            if(st.isEmpty()) nge.add(-1);
            else
            {
                nge.add(st.peek());
            }
            st.push(arr[i]);
        }
        Collections.reverse(nge);
        return nge;
    }
}