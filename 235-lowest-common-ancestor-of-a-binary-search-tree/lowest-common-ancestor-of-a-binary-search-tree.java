/**
 * Definition for a binary tree node.
  * public class TreeNode {
   * int val;
    * TreeNode left;
     * TreeNode right;
      * TreeNode(int x) { val = x; }
       * }
        */
        
        class Solution {
            public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
                    TreeNode curr = root;
                    
                            while (curr != null) {
                                        // If both nodes are greater than the current node, move right
                                                    if (p.val > curr.val && q.val > curr.val) {
                                                                    curr = curr.right;
                                                                                } 
                                                                                            // If both nodes are smaller than the current node, move left
                                                                                                        else if (p.val < curr.val && q.val < curr.val) {
                                                                                                                        curr = curr.left;
                                                                                                                                    } 
                                                                                                                                                // If we find a split or one node matches curr, this is the LCA
                                                                                                                                                            else {
                                                                                                                                                                            return curr;
                                                                                                                                                                                        }
                                                                                                                                                                                                }
                                                                                                                                                                                                        return null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            } 