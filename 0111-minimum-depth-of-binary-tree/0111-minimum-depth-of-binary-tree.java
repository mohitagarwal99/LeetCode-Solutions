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
    int i;
    public int minDepth(TreeNode root) {
        if(root == null && i == 0)
            return 0;
        i =1;
        if(root == null)
            return Integer.MAX_VALUE;
        if(root.left == null && root.right == null)
            return 1;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return 1+ Math.min(left,right);
    }
}