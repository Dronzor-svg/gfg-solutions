/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    int ans=-1;
    public int findMaxFork(Node root, int k) {
        // code here.
        if(root==null) return -1;
        
        if(root.data<=k)
        {
            ans=Math.max(ans,root.data);
            
        }
        
        findMaxFork(root.left,k);
        findMaxFork(root.right,k);
        
        return ans;
    }
}