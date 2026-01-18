class Solution {
    public ArrayList<Integer> nextFreqGreater(int[] arr) {
        // code here
        HashMap<Integer,Integer> mpp=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> list=new ArrayList<>();
        int[] ans=new int[arr.length];
        for(int nums : arr)
        {
            mpp.put(nums,mpp.getOrDefault(nums,0)+1);
        }
        
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && mpp.get(st.peek())<=mpp.get(arr[i]))
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                ans[i]=-1;
            }
            else
            {
                ans[i]=st.peek();
            }
            st.push(arr[i]);
        }
        for(int i=0;i<ans.length;i++)
        {
            list.add(ans[i]);
        }
        return list;
    }
}