class Solution {
    public String removeKdig(String s, int k) {
        // code here
        if(k>=s.length()) return "0";
        Stack<Character> st=new Stack<>();
        
        for(char ch : s.toCharArray())
        {
            while(!st.isEmpty() && k>0 && st.peek()>ch)
            {
                st.pop();
                k--;
            }
            st.push(ch);
            
        }
        while(k>0 && !st.isEmpty())
        {
            st.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        for(char ch : st)
        {
            sb.append(ch);
        }
        int idx=0;
        while(idx<sb.length() && sb.charAt(idx)=='0')
        {
            idx++;
        }
        String result=sb.substring(idx);
        
        return result.isEmpty() ? "0" : result;
    }
}