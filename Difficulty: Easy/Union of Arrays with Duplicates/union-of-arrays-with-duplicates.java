class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        Set<Integer> s=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            s.add(a[i]);
        }
        for(int i=0;i<b.length;i++)
        {
            if(!s.contains(b[i]))
            {
                s.add(b[i]);
            }
        }
        for(int x : s)
        {
            list.add(x);
        }
        return list;
        
    }
}