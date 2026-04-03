/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> findSpiral(Node root) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int cnt=0;
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty())
        {
            int size=q.size();
            ArrayList<Integer> ans=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                Node front=q.poll();
                if(front.left!=null) q.offer(front.left);
                if(front.right!=null) q.offer(front.right);
                
                ans.add(front.data);
                
            }
            if(cnt%2==0)
                {
                    Collections.reverse(ans);
                }
                
            for(int i=0;i<ans.size();i++)
            {
                list.add(ans.get(i));
            }
            cnt++;
        }
        return list;
        
    }
}