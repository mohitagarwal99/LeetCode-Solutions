class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Integer.MIN_VALUE , total = 0.0;
        int prev = 0;
        for(int i = 0; i < nums.length; i++)
        {
            total += nums[i];
            if(i < k-1)
                continue;
            if(i >= k)
            {
                total -= nums[prev];
                prev++;
            }
            max = Math.max(max, total);
        }
        return max/k;
    }
}