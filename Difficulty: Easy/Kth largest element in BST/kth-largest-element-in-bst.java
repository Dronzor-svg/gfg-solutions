/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution {
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root, int k) {
        // Your code here
        
        ArrayList<Integer> list=new ArrayList<>();
        list=solve(root,list);
        
        Collections.sort(list);
        
        return list.get(list.size()-k);
        
    }
    ArrayList<Integer> solve(Node root,ArrayList<Integer> list)
    {
        if(root==null) return list;
        
        list.add(root.data);
        solve(root.left,list);
        solve(root.right,list);
        
        return list;
    }
}