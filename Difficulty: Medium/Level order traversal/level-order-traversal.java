/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Queue<Node> queue=new LinkedList<>();
        if(root ==null) return ans;
        
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int size=queue.size();
            ArrayList<Integer> subList=new ArrayList<>();
            
            for(int i=0;i<size;i++)
            {
                if(queue.peek().left!=null)
                {
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right!=null)
                {
                    queue.offer(queue.peek().right);
                }
                subList.add(queue.poll().data);
            }
            ans.add(subList);
        }
        return ans;
    }
}