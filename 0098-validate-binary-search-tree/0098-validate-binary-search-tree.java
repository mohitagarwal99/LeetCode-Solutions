/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean check(TreeNode root,Long min,Long max){
        if(root==null)
            return true;
        
        if(root.val<=min || root.val>=max)
            return false;
        
         return check(root.left,min,(long)root.val)&&check(root.right,(long)root.val,max);
    }
    public boolean isValidBST(TreeNode root) {
       return check(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}