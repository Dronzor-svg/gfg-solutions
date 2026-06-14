class Solution {
    
    boolean mirror(Node a, Node b) {
        if (a == null && b == null) return true;
        
        if (a == null || b == null) return false;
        
        return a.data == b.data
                && mirror(a.left, b.right)
                && mirror(a.right, b.left);
    }
    
    public boolean isSymmetric(Node root) {
        if (root == null) return true;
        
        return mirror(root.left, root.right);
    }
}