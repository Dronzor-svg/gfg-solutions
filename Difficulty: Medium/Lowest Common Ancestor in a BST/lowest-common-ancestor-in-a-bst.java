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
    public Node LCA(Node root, Node n1, Node n2) {
        // code here
        if(root==null) return null;
        if(root==n1 || root==n2) return root;
        
        Node leftAns=LCA(root.left,n1,n2);
        Node rightAns=LCA(root.right,n1,n2);
        
        if(leftAns!=null && rightAns==null)
        {
            return leftAns;
        }
        else if(leftAns==null && rightAns!=null)
        {
            return rightAns;
        }
        else if(leftAns!=null && rightAns!=null) return root;
        else return null;
    }
}