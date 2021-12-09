 class Solution {
   //diff btw left and right subtree is less than 1
    public boolean isBalanced(TreeNode root) {
        
        if (helper(root, 0) == -1) return false;
        return true;
    }
    public static int helper(TreeNode root, int depth){
        
        if (root==null) return depth;
        depth++;
        
        int leftDepth = helper(root.left, depth);
        int rightDepth = helper(root.right, depth);
        
        if (leftDepth==-1||rightDepth==-1) return -1;
        
        if (Math.abs(leftDepth-rightDepth) > 1) return -1;
        if (leftDepth>rightDepth) return leftDepth;
        return rightDepth;
        
    }
}
