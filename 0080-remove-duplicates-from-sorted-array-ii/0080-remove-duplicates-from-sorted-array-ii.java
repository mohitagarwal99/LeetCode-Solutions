class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1)
            return 1;
        int curr = nums[0], count = 1, i = 1, j = 1;
        
        while(i < nums.length){
            if(nums[i] == curr){
                count++;
            }
            else{
                curr = nums[i];
                count = 1;
            }
            while(count > 2 && i < nums.length && nums[i] == curr){
                i++;
            }
            if(i == nums.length){
                return j;
            }
            if(nums[i] != curr){
                curr = nums[i];
                count = 1;
            }
            nums[j++] = nums[i++];
            
            
        }
        return j;
    }
}