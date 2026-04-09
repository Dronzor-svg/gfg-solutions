class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        // code here
        HashSet<Integer> st=new HashSet<>();
        HashSet<Integer> st1=new HashSet<>();
        for(int i : a)
        {
            st.add(i);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i : b)
        {
            if(st.contains(i)) st1.add(i);
        }
        for(int i : st1)
        {
            list.add(i);
        }
        Collections.sort(list);
        return list;
    }
}