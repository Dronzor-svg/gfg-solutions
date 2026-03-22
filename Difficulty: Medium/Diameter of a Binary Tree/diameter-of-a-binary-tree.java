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
} */

class Solution {
    public int diameter(Node root) {
        // code here
        if(root==null) return 0;
        
        int op1=diameter(root.left);
        int op2=diameter(root.right);
        
        int op3=height(root.left)+height(root.right)+2;
        
        int max=Math.max(op1,Math.max(op2,op3));
        
        return max;
    }
    int height(Node root)
    {
        if(root==null) return -1;
        
        int left=height(root.left);
        int right=height(root.right);
        
        int max=Math.max(left,right)+1;
        
        return max;
    }
}