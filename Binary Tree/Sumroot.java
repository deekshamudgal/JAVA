class Solution {
    public int sumNumbers(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        
        sumNumbers(root, nums, 0);
        int ans = 0;
        
        for(int num : nums){
            ans += num;
        }
        return ans;
    }
    
    private void sumNumbers(TreeNode node, List<Integer> nums, int curr){
        curr = (curr * 10) + node.val;
        if(node.left == null && node.right == null){
            nums.add(curr);
            return;
        }
        if(node.left != null)
            sumNumbers(node.left, nums, curr);
        if(node.right != null)
            sumNumbers(node.right, nums, curr);
        
    }
}
