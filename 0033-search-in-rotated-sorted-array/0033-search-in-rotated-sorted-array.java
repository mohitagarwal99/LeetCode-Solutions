class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int lo = 0;
        int hi = n - 1;
        while(lo < hi)
        {
            int mid = (lo + hi) / 2;
            if(nums[mid] > nums[hi])
            {
                lo = mid+1;
            }
            else
            {
                hi = mid;
            }
        }
        int rotation = lo;
        lo = 0; hi = n-1;
        while(lo <= hi)
        {
            int mid = (lo + hi)/2;
            int rmid = (mid + rotation) % n;
            if(nums[rmid] == target)
            {
                return rmid;
            }
            if(nums[rmid] > target)
            {
                hi = mid-1;
            }
            else
                lo = mid +1;
        }
        return -1;
    }
}