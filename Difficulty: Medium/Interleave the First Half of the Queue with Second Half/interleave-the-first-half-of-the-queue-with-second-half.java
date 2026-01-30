class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        Queue<Integer> q1=new LinkedList<>();
        Queue<Integer> q2=new LinkedList<>();
        int half=q.size()/2;
        int a=0;
        while(!q.isEmpty() && a<half)
        { 
            q1.add(q.poll());
            a++;
        }
        a=0;
        int full=q.size();
        while(!q.isEmpty() && a<full)
        {
            q2.add(q.poll());
            a++;
        }
        while(!q1.isEmpty() && !q2.isEmpty())
        {
            q.add(q1.poll());
            q.add(q2.poll());
        }
    }
}
