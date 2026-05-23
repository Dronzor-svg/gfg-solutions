/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBST(Node root) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        inorder(root,list);
        for(int i=1;i<list.size();i++)
        {
            if(list.get(i)<=list.get(i-1)) return false;
        }
        return true;
    }
    void inorder(Node root,ArrayList<Integer> list)
    {
        if(root==null) return;
        
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
    
}