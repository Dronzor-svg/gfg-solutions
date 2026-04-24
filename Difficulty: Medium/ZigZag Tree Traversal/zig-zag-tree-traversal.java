/*
class Node {
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        if(root==null)
        {
            return list;
        }
        q.add(root);
        boolean leftToRight=true;
        while(!q.isEmpty())
        {
            int size=q.size();
            int[] arr=new int[size];
            for(int i=0;i<size;i++)
            {
                Node temp=q.poll();
                int index=leftToRight ? i : size-1-i;
                arr[index]=temp.data;
                
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            for(int i=0;i<arr.length;i++)
            {
                list.add(arr[i]);
            }
            leftToRight=!leftToRight;
        }
        return list;
    }
}