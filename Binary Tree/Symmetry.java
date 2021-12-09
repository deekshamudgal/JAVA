class Solution {
    public boolean isSymmetric(TreeNode root) {
        return visit(root.left, root.right);
    }
    
    private boolean visit(TreeNode n1, TreeNode n2) {
        if (n1 == null || n2 == null) return n1 == n2;
        return n1.val == n2.val && visit(n1.left, n2.right) && visit(n1.right, n2.left);
    }
}
