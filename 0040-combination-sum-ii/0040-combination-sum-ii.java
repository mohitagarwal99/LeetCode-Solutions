class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        
        combinations(candidates, 0, target, ans, new ArrayList<>());
        
        return ans;
    }
    
    public void combinations(int[] candidates, int ind, int target, List<List<Integer>> ans, List<Integer> ls){
        if(target < 0)
            return;
        if(target == 0){
            ans.add(new ArrayList(ls));
            return;
        }
        for(int i = ind; i < candidates.length; i++){
            
            if(i != ind && candidates[i] == candidates[i-1]) 
                continue;
            
            ls.add(candidates[i]);
            combinations(candidates, i+1, target-candidates[i], ans, ls);
            ls.remove(ls.size()-1);
            
        }
    }
}