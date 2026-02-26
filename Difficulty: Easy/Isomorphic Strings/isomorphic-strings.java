class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        Map<Character,Character> mpp=new HashMap<>();
        mpp.put(s1.charAt(0),s2.charAt(0));
        for(int i=1;i<s1.length();i++)
        {
            if(mpp.containsKey(s1.charAt(i)))
            {
                if(mpp.get(s1.charAt(i))!=s2.charAt(i)) return false;
            }
            else if(mpp.containsValue(s2.charAt(i))) return false;
            else
            {
                mpp.put(s1.charAt(i),s2.charAt(i));
            }
        }
        return true;
    }
}