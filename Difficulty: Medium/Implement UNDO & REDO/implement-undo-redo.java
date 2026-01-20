class Solution {
    Stack<Character> st=new Stack<>();
    Stack<Character> undost=new Stack<>();
    
    public void append(char x) {
        // append x into document
        st.push(x);
        undost.clear();
    }
    
    public void undo() {
        // undo last change
        if(!st.isEmpty())
        {
            undost.push(st.pop());
        }
        
    }

    public void redo() {
        // redo changes
        if(!undost.isEmpty())
        {
            st.push(undost.pop());
        }
    }

    public String read() {
        // read the document
        StringBuilder sb=new StringBuilder();
        for(char ch : st)
        {
            sb.append(ch);
        }
        return sb.toString();
    }
}
