/*  A Binary Tree nodea
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
class Tree {
    ArrayList<Integer> noSibling(Node node) {
        // code here
        ArrayList<Integer> list=new ArrayList<Integer>();
        list=solve(node,list);
         if(list.size()==0){
            list.add(-1);
            return list;
        }

        Collections.sort(list); // GFG usually expects sorted output

        return list;
    }
    ArrayList<Integer> solve(Node root,ArrayList<Integer> list)
    {
        if(root==null) return list;
        
        else if(root.left==null && root.right!=null) list.add(root.right.data);
        
        else if(root.right==null && root.left!=null) list.add(root.left.data);
        
        solve(root.left,list);
        solve(root.right,list);
        
        return list;
    }
}