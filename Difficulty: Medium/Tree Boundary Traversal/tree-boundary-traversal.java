/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        ans.add(root.data);
        traverseLeft(root.left,ans);
        traverseLeaf(root.left,ans);
        traverseLeaf(root.right,ans);
        traverseRight(root.right,ans);
        
        return ans;
    }
    void traverseLeft(Node root, ArrayList<Integer> ans)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if((root==null) || (root.left==null && root.right==null)) return;
        ans.add(root.data);
        if(root.left!=null)
        {
            traverseLeft(root.left,ans);
        }
        else
        {
            traverseLeft(root.right,ans);
        }
    }
    void traverseLeaf(Node root,ArrayList<Integer> ans)
    {
        if(root==null) return;
        if(root.left==null && root.right==null)
        {
            ans.add(root.data);
            return;
        }
        traverseLeaf(root.left,ans);
        traverseLeaf(root.right,ans);
    }
    void traverseRight(Node root,ArrayList<Integer> ans)
    {
        if((root==null) || (root.left==null && root.right==null)) return;
        
        if(root.right!=null)
        {
            traverseRight(root.right,ans);
        }
        else
        {
            traverseRight(root.left,ans);
        }
        ans.add(root.data);
    }
}