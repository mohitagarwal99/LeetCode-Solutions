class Solution {

    List<List<Integer>> list = new ArrayList<List<Integer>>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        combination(candidates, 0, target, new ArrayList<Integer>() );
        return list;
            
    }
    void combination(int []candidates, int i, int target, List ls )
    {
        
        if(i == candidates.length)
        {
            if(target == 0){
            list.add(new ArrayList(ls));
            }
            return;
        }
        
            
        if(target < 0)
            return;
        combination(candidates, i+1, target, ls);
        ls.add(candidates[i]);
        combination(candidates, i, target - candidates[i], ls);
        ls.remove(ls.indexOf(candidates[i]));
    }
}