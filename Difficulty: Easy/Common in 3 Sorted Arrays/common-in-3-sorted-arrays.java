class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        // code here
        Set<Integer> st1=new HashSet<>();
        Set<Integer> st2=new HashSet<>();
        Set<Integer> st3=new HashSet<>();
        
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<a.length;i++)
        {
            st1.add(a[i]);
        }
        for(int i=0;i<b.length;i++)
        {
            if(st1.contains(b[i]))
            {
                st2.add(b[i]);
            }
        }
        for(int i=0;i<c.length;i++)
        {
            if(st2.contains(c[i])) st3.add(c[i]);
        }
        
        for(int i : st3)
        {
            list.add(i);
        }
        Collections.sort(list);
        return list;
    }
}