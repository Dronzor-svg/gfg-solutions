class Solution {

 // Variable to track the maximum consecutive path length found

 private int maxLen;

 

 public int longestConsecutive(Node root) {

  if (root == null) {

   return - 1;

  }

  

  maxLen = 0;

  // Start DFS from root; expected value for root is root.data itself, initial path length is 0

  dfs(root, root.data, 0);

  

  // If no consecutive path of length >= 2 exists, return -1

  return maxLen > 1 ? maxLen : -1;

 }

 

 private void dfs(Node node, int expected, int currentLength) {

  if (node == null) {

   return;

  }

  

  // If current node matches the expected value, increment the sequence length

  if (node.data == expected) {

   currentLength++;

  } else {

   // Otherwise, reset sequence length to 1 starting from this node

   currentLength = 1;

  }

  

  // Update the maximum length found so far

  maxLen = Math.max(maxLen, currentLength);

  

  // Recursively check left and right subtrees with the next consecutive value (node.data + 1)

  dfs(node.left, node.data + 1, currentLength);

  dfs(node.right, node.data + 1, currentLength);

 }

}

 