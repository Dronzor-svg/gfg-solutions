class Solution {
    public char getMaxOccuringChar(String s) {
        HashMap<Character, Integer> mpp = new HashMap<>();
        

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
        }
        
        int max = 0;
        char ans = 0;
        

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int freq = mpp.get(ch);
            
            if (freq > max) {
                max = freq;
                ans = ch;
            }
            else if(freq==max)
            {
                if(ch<ans)
                {
                    ans=ch;
                }
            }
        }
        
        return ans;
    }
}
