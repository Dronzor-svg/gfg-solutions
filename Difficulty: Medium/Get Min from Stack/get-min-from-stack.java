class SpecialStack {
    Stack<Long> st=new Stack<>();
    long mini;
    public SpecialStack() {
        // Define Stack
        mini=Long.MAX_VALUE;
    }

    public void push(int x) {
        // Add an element to the top of Stack
        long v=x;
        if(st.isEmpty())
        {
            mini=v;
            st.push(v);
        }
        else
        {
            if(v>mini) st.push(v);
            else
            {
                st.push(2*v-mini);
                mini=v;
            }
        }
    }

    public void pop() {
        // Remove the top element from the Stack
        if(st.isEmpty()) return;
        long v=st.peek();
        st.pop();
        if(v<mini) mini=2*mini-v;
    }

    public int peek() {
        // Returns top element of the Stack
        if(!st.isEmpty())
        {
            long v=st.peek();
            if(mini<v) return (int)v;
            else return (int)mini;
        }
        else return -1;
    }

    boolean isEmpty() {
        // Check if the stack is empty
        if(st.isEmpty()) return true;
        else return false;
    }

    public int getMin() {
        // Finds minimum element of Stack
        if(st.isEmpty()) return -1;
        else return  (int)mini;
    }
}