class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        // for(int i = 0; i < nums.length; i++){
            permutations(nums, 0, ans, nums.length, new ArrayList<Integer>());
        // }
        
        return ans;
    }
        
        
        
        public void permutations(int[] nums, int ind, List<List<Integer>> ans, int n, List<Integer> list){
            if(list.size() == n){
                ans.add(new ArrayList<>(list));
                return;
            }
            for(int i = 0; i < n; i++){
                if(list.contains(nums[i]))
                    continue;
                list.add(nums[i]);
                permutations(nums, i+1, ans, n, list);
                list.remove(list.size()-1);
            }
        }
        
}