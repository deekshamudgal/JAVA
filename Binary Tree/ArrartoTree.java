class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        // int mid = nums.length/2;
        return toHeightBalance(nums,0,nums.length-1);
        
    }
    private TreeNode toHeightBalance(int[] nums,int left,int right){
        
        if(left>right) return null;
        int mid = (left+right)/2;
        
        TreeNode root = new TreeNode();
        root.val = nums[mid];
        
        root.left  = toHeightBalance(nums,left,mid-1);
        root.right = toHeightBalance(nums,mid+1,right);
        
        return root;
        
    }
}
