class Solution {
    public int rob(TreeNode root) {
        int[] r = helper(root);
        return Math.max(r[0], r[1]);
    }
     // the return array = {the max if we drop the current node, the max if we take the current node}
    public int[] helper(TreeNode root){
        if(root == null) return new int[]{0,0};
        int[] left = helper(root.left), right = helper(root.right);
        int take = left[0]+right[0]+root.val; 
		int drop = Math.max(left[0],left[1])+Math.max(right[0],right[1]); 
        return new int[]{drop, take};
    }
    
}
