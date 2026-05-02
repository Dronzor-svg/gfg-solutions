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
    int cnt=0;
    public int countAllPaths(Node root, int k) {
        // code here
        
        
        ArrayList<Integer> path=new ArrayList<>();
        solve(root,k,path);
        return cnt;
    }
    
    void solve(Node root,int k,ArrayList<Integer> path)
    {
        if(root==null) return;
        
        path.add(root.data);
        
        solve(root.left,k,path);
        solve(root.right,k,path);
        
        int sum=0;
        
        for(int i=path.size()-1;i>=0;i--)
        {
            sum+=path.get(i);
            if(sum==k) cnt++;
            
        }
        path.remove(path.size()-1);
    }
}