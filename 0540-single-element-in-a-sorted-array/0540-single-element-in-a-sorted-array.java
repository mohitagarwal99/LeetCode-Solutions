class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n == 1)
            return nums[0];
        if(nums[0] != nums[1])
            return nums[0];
        if(nums[n-1] != nums[n-2])
            return nums[n-1];
        
        return search(nums, 1, n - 2);
        }
    
    public int search(int [] nums, int low, int high){
        if(low > high){
            return nums[low];
        }
        int mid = (low + high) / 2;
        
        if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1])
            return nums[mid];
        
        if ((mid % 2 == 1 && nums[mid] == nums[mid - 1])
                    || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                // Eliminate the left half:
                return search(nums, mid + 1, high);
            }
            // We are in the right:
            else {
                // Eliminate the right half:
                return search(nums, low, mid-1);
            }
    }
}