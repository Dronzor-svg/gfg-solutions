/*
class Node{
    int data;
    Node left,right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
*/
class Solution {
    public boolean isSumProperty(Node root) {
        //  code here
            if(root == null)
          return true ;
          
        if(root.left == null && root.right == null)
          return true ;
          
          int left = (root.left == null) ? 0 : root.left.data;
          int right = (root.right == null) ? 0 : root.right.data ;
          
          boolean sumTrue = (left+right== root.data) ? true : false ;
          
          return (sumTrue && isSumProperty(root.left) && isSumProperty(root.right));
          
    }
}