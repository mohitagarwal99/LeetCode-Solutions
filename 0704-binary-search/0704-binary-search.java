class Solution {
    public int search(int[] nums, int target) {
        return find(nums, 0, nums.length - 1, target);
    }
    public int find(int[] nums, int start, int end, int target)
    {
        if(start > end)
            return -1;
        int mid = (start + end) / 2;
        if(nums[mid] == target)
            return mid;
        else if(nums[mid] > target)
            return find(nums, start, mid-1, target);
        else
            return find(nums, mid+1, end, target);
    }
}