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
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        // code here
        TreeMap<Integer,TreeMap<Integer,List<Integer>>> nodes=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        
        q.offer(new Pair(root,0,0));
        while(!q.isEmpty())
        {
            Pair temp=q.poll();
            Node frontNode=temp.node;
            int hd=temp.hd;
            int lvl=temp.lvl;
            
            nodes.putIfAbsent(hd,new TreeMap<>());
            nodes.get(hd).putIfAbsent(lvl,new ArrayList<>());
            nodes.get(hd).get(lvl).add(frontNode.data);
            
            if(frontNode.left!=null)
            {
                q.offer(new Pair(frontNode.left,hd-1,lvl+1));
            }
            if(frontNode.right!=null)
            {
                q.offer(new Pair(frontNode.right,hd+1,lvl+1));
            }
            
        }
        for(TreeMap<Integer,List<Integer>> lvlMap : nodes.values())
{
    ArrayList<Integer> col = new ArrayList<>();

    for(List<Integer> list : lvlMap.values())
    {
        for(int val : list)
        {
            col.add(val);
        }
    }

    ans.add(col);
}
return ans;
    }
}
class Pair
{
    Node node;
    int hd;
    int lvl;

    Pair(Node node,int hd,int lvl)
    {
        this.node=node;
        this.hd=hd;
        this.lvl=lvl;
    }
}