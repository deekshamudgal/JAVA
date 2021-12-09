class Solution {
    private TreeNode first; // first voilated element
    private TreeNode prev; // check the last root value in inorder
    private TreeNode middle;//adjecent element of the first voilated element
    private TreeNode last; // secound voilated element
    private void inorder(TreeNode root)
    {
        if(root==null) return;
        inorder(root.left);
        //from here we do our action
        if(prev!=null && (prev.val>root.val))
        {
            if(first==null)
            {
                first=prev;//bigger root value put in the first which were in the prev 
                middle=root;//make the next value of that voilated elelement as middle 
            }
            else
            {
                last=root; // mark the last voilated element
            }
        }
        prev=root;
        //here work ends of comparison 
        inorder(root.right);
    }
    public void recoverTree(TreeNode root) {
        first=middle=last=null;
        prev=new TreeNode(Integer.MIN_VALUE);
        inorder(root);
        if(first!=null && last!=null) // this swap will happen in case we have two voilations in the sorted array
        {
            int temp=first.val;
            first.val=last.val;
            last.val=temp;
        }
        else if(first!=null && middle!=null) // this swap will work if we have 1 voilation in sorted array
        {
            int temp=first.val;
            first.val=middle.val;
            middle.val=temp;
        }
    }
}
