class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        boolean leftToRight = true;

        while (!q.isEmpty()) {
            int size = q.size();
            LinkedList<Integer> level = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                Node frontNode = q.poll();

                if (leftToRight) {
                    level.addLast(frontNode.data);
                } else {
                    level.addFirst(frontNode.data);
                }

                if (frontNode.left != null) q.offer(frontNode.left);
                if (frontNode.right != null) q.offer(frontNode.right);
            }

            result.addAll(level);
            leftToRight = !leftToRight;
        }

        return result;
    }
}