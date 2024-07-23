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
    int val;
    Pair(int r, int n){
        row = r;
        val = n;
    }
}

class Solution {
    TreeMap<Integer, List<Pair>> map = new TreeMap<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        traverse(root, 0, 0);
        List<List<Integer>> list = new ArrayList<>();
        for(List<Pair> l : map.values()){
            l.sort(new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                if (p1.row != p2.row) {
                    return Integer.compare(p1.row, p2.row);
                } else {
                    return Integer.compare(p1.val, p2.val);
                }
            }
        });
            List<Integer> temp = new ArrayList<>();
            for(Pair p: l){
                temp.add(p.val);
            }
            list.add(temp);
        }
        return list;
        
        
        
    }
    public void traverse(TreeNode root, int col, int row){
        if(root == null){
            return;
        }
        // Step 1: Retrieve the list associated with the key or create a new one if it doesn't exist.
        List<Pair> list = map.getOrDefault(col, new ArrayList<>());

        // Step 2: Add the value to the list.
        list.add(new Pair(row, root.val));

        // Step 3: Put the updated list back into the map if a new list was created.
        map.put(col, list);
        traverse(root.left, col-1, row+1);
        traverse(root.right, col+1, row+1);
    }
}