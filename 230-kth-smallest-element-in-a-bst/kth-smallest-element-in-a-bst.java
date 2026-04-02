class Solution {
        public int kthSmallest(TreeNode root, int k) {
                Stack<TreeNode> stack = new Stack<>();
                        TreeNode curr = root;
                                int count = 0;

                                        while (curr != null || !stack.isEmpty()) {
                                                    // 1. Reach the leftmost node of the current subtree
                                                                while (curr != null) {
                                                                                stack.push(curr);
                                                                                                curr = curr.left;
                                                                                                            }

                                                                                                                        // 2. Process the node
                                                                                                                                    curr = stack.pop();
                                                                                                                                                count++;
                                                                                                                                                            if (count == k) return curr.val;

                                                                                                                                                                        // 3. Move to the right subtree
                                                                                                                                                                                    curr = curr.right;
                                                                                                                                                                                            }
                                                                                                                                                                                                    
                                                                                                                                                                                                            return -1; // Should not reach here per constraints
                                                                                                                                                                                                                }
                                                                                                                                                                                                                }
