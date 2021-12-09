class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)return true;   //if both are at null then true
        if(p==null||q==null)return false;     // if any one is null but the other one is not so it is not same
        if(p.val==q.val){                              //if root have same value then we will check for left and right node
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }
        return false;      //if root doesnot have same value
    }
}
