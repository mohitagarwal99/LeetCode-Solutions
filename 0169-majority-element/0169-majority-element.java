class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int mazority = n/2;
        int count = 0, element = nums[0];
        for(int i = 0; i < n; i++){
            if(element == nums[i])
                count++;
            else{
                if(count == 0){
                    element = nums[i];
                    count++;
                }
                else{
                    count--;
                }
            }
        }
        return element;
    }
}