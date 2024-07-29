class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0, j = 0, min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum >= target){
                min = Math.min(min, i-j+1);
                while(sum >=target){
                    sum -= nums[j++];
                    if(sum >= target){
                        min = Math.min(min, i-j+1);
                    }
                }
                
            }
        }
        return (min == Integer.MAX_VALUE)? 0 : min;
    }
}