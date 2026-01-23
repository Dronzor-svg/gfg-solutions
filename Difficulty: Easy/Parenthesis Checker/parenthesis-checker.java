class Solution {
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') st.push(s.charAt(i));
            
            else
            {
                if(st.isEmpty()) return false;
                
                char ch=st.peek();
                st.pop();
                if((s.charAt(i)==')' && ch!='(') || (s.charAt(i)=='}' && ch!='{') || (s.charAt(i)==']' && ch!='[')) return false;
                
            }
        }
        return st.isEmpty();
    }
}
