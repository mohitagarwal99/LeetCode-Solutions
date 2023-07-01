class Solution {
    public int removeDuplicates(int[] nums) {
        int cur = 0, prev = 101;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != prev)
            {
                nums[cur] = nums[i];
                cur++;
                prev = nums[i];
            }
        }
        return cur;
    }
}