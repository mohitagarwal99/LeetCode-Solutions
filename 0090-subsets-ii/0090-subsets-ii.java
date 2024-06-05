class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        
        
        findSubsets(ans, 0, nums, al);
        return ans;
    }
//     public void subsets(HashSet<List<Integer>> ans, int i, int[] nums, List<Integer> al){
//         if(i == nums.length){
//             ans.add(new ArrayList<>(al));
//             return;
//         }
        
//         subsets(ans, i+1, nums, al);
        
//         al.add(nums[i]);
//         subsets(ans, i+1, nums, al);
        
//         al.remove(al.size()-1);
        
//     }
    
    public void findSubsets(List<List<Integer>> ansList, int ind, int[] nums, List<Integer> ds ) {
        ansList.add(new ArrayList<>(ds)); 
        for(int i = ind;i<nums.length;i++) {
            if(i!=ind && nums[i] == nums[i-1]) continue; 
            ds.add(nums[i]); 
            findSubsets(ansList, i+1, nums, ds ); 
            ds.remove(ds.size() - 1);
        }
        
    }
}