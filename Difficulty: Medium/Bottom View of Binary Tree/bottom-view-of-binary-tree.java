/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<Pair> q=new LinkedList<>();
        TreeMap<Integer,Integer> mpp=new TreeMap<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty())
        {
            Pair temp=q.poll();
            Node frontNode=temp.node;
            int hd=temp.hd;
            
            mpp.put(hd,frontNode.data);
            
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