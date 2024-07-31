class Solution {
    public boolean canJump(int[] nums) {
        boolean dp[] = new boolean[nums.length];
        return helper(nums, nums.length, 0, dp);
    }
    public boolean helper(int[] nums, int n, int ind, boolean dp[]){
        // System.out.println(n + " "+ ind);
        if(ind >= n-1){
            return true;
        }
        if(nums[ind] == 0){
            // System.out.println("if");
            return false;
        }
        if(dp[ind]){
            return false;
        }
        for(int i = nums[ind];  i >= 1; i--){
            boolean flag = helper(nums, n, ind+i, dp);
            if(flag){
                return true;
            }
        }
        dp[ind] = true;
        return false;
    }
}