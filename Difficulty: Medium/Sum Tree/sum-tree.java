class Solution {
    
    boolean isSumTree(Node root) {
        return isSumTreeFast(root).first;
    }
    
    Pair isSumTreeFast(Node root) {
        
        if (root == null) {
            return new Pair(true, 0);
        }
        
        if (root.left == null && root.right == null) {
            return new Pair(true, root.data);
        }
        
        Pair leftAns = isSumTreeFast(root.left);
        if (!leftAns.first) return new Pair(false, 0);

        Pair rightAns = isSumTreeFast(root.right);
        if (!rightAns.first) return new Pair(false, 0);
        
        boolean condn = (root.data == leftAns.second + rightAns.second);
        
        if (condn) {
            return new Pair(true, 2 * root.data);
        } else {
            return new Pair(false, 0);
        }
    }
}

class Pair {
    boolean first;
    int second;
    
    Pair(boolean first, int second) {
        this.first = first;
        this.second = second;
    }
}