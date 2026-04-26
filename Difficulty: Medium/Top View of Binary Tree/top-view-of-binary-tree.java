/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        TreeMap<Integer,Integer> mpp=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty())
        {
            Pair temp=q.poll();
            Node frontNode=temp.node;
            int hd=temp.hd;
            
            if(!mpp.containsKey(hd))
            {
                mpp.put(hd,frontNode.data);
            }
            
            if(frontNode.left!=null)
            {
                q.offer(new Pair(frontNode.left,hd-1));
            }
            if(frontNode.right!=null)
            {
                q.offer(new Pair(frontNode.right,hd+1));
            }
        }
        for(Map.Entry<Integer,Integer> entry : mpp.entrySet())
        {
            ans.add(entry.getValue());
        }
        return ans;
    }
}
class Pair
{
    Node node;
    int hd;
    Pair(Node node,int hd)
    {
        this.node=node;
        this.hd=hd;
    }
}