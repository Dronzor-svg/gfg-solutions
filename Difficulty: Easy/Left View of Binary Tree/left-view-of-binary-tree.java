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
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        helper(root,ans,0);
        return ans;
        
    }
    void helper(Node root,ArrayList<Integer> ans,int lvl)
    {
        if(root==null) return ;
        
        if(lvl==ans.size())
        {
            ans.add(root.data);
        }
        
        
        helper(root.left,ans,lvl+1);
        helper(root.right,ans,lvl+1);
    }
}