/*
Definition for Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    int size=1;
    public int getSize(Node root) {
        // code here
        if(root==null) return 0;
        
        return 1 + getSize(root.left)+getSize(root.right);
    }
}