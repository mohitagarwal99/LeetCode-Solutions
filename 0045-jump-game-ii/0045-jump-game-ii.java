class Solution {
    public int jump(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        helper(nums, nums.length, 0, dp, 0);
        return dp[nums.length - 1];
    }
    
    public void helper(int[] nums, int n, int ind, int dp[], int jump){
        
        if(ind >= n-1){
            dp[n-1] = Math.min(dp[n-1], jump);
            return;
        }

        if(nums[ind] == 0){
            return;
        }
        if(jump >= dp[ind]){
            return;
        }
        dp[ind] = jump;
        for(int i = nums[ind];  i >= 1; i--){
            helper(nums, n, ind+i, dp, jump+1);
            }
        
        return;
    }
}

