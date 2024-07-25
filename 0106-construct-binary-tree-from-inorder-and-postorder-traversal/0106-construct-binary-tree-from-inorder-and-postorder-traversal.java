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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> inmap = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            inmap.put(inorder[i], i);
        }
        return helper(postorder, 0, postorder.length-1, inorder, 0, inorder.length-1, inmap);
    }
    public TreeNode helper(int[] postorder, int postStart, int postEnd, int[] inorder, int inStart, int inEnd, HashMap<Integer, Integer> inmap){
        if(postStart > postEnd || inStart > inEnd){
            return null;
        }
        int rootInd = inmap.get(postorder[postEnd]);
        TreeNode root = new TreeNode(postorder[postEnd]);
        int leftNums = rootInd - inStart;
        
        root.left = helper(postorder, postStart, postStart+leftNums-1, inorder, inStart, inStart + leftNums-1, inmap);
        root.right = helper(postorder, postStart+leftNums , postEnd-1, inorder, rootInd + 1, inEnd, inmap);
            
        return root;
    }
}