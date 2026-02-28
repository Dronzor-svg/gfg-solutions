class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        int[] arr=new int[st.size()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=st.pop();
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            st.push(arr[i]);
        }
    }
}