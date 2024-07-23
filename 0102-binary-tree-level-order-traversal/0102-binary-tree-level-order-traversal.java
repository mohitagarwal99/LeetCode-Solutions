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
class Pair{
    int row;
    TreeNode node;
    Pair(int row, TreeNode n){
        this.row = row;
        node = n;
    }
}
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        if(root == null)
            return list;
        q.add(new Pair(0, root));
        bfs(q, list);
        
        return list;
    }
    public void bfs(Queue<Pair> q, List<List<Integer>> list){
        Pair temp = q.poll();
        if(temp == null){
            return;
        }
        if(temp.row == list.size()){
            list.add(new ArrayList<>());
        }
        list.get(temp.row).add(temp.node.val);
        if(temp.node.left != null){
            
            q.add(new Pair(temp.row + 1 , temp.node.left));
        }
        if(temp.node.right != null){
            q.add(new Pair(temp.row + 1 , temp.node.right));
        }
        bfs(q, list);
    }
}