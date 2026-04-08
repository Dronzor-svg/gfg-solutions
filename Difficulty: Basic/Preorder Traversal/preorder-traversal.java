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
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer> result=new ArrayList<>();
        preOrder(root,result);
        return result;
        
    }
    void preOrder(Node node,ArrayList<Integer> result)
    {
        if(node==null) return;
        
        result.add(node.data);
        preOrder(node.left,result);
        preOrder(node.right,result);
    }
}