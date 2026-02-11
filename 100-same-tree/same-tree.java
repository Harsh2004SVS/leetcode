import java.util.Stack;

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        Stack<TreeNode> stack = new Stack<>();
        stack.push(p);
        stack.push(q);

        while (!stack.isEmpty()) {
            TreeNode n2 = stack.pop();
            TreeNode n1 = stack.pop();

            if (n1 == null && n2 == null) continue;
            if (n1 == null || n2 == null) return false;
            if (n1.val != n2.val) return false;

            stack.push(n1.left);
            stack.push(n2.left);
            stack.push(n1.right);
            stack.push(n2.right);
        }
        return true;
    }
}
