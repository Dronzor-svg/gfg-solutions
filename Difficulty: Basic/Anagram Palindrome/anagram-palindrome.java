class Solution {
    boolean canFormPalindrome(String s) {
        // code here
        HashMap<Character,Integer> mpp=new HashMap<>();
        int a=s.length();
        int len=0;
        int cnt=0;
        for(int i=0;i<a;i++)
        {
            char ch=s.charAt(i);
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
            len++;
        }
        if(len%2==0)
        {
            for (Integer value : mpp.values())
            {
                
                if(value%2!=0)
                {
                    return false;
                }
            }
        }
        else
        {
            for (Integer value : mpp.values())
            {
                if(value%2!=0)
                {
                    cnt++;
                }
                if(cnt>1) return false;
            }
        }
        return true;
    }
}