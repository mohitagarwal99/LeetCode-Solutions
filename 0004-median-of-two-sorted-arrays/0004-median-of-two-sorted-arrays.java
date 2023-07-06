class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int prev = 0, cur = 0, m = nums1.length, n = nums2.length, i =0, j = 0;
        int mid = (m+n)/2;
        for(int k = 0; k <= mid; k++)
        {
            prev = cur;
            if(i < m && j < n)
            {
                
                if(nums1[i] < nums2[j])
                {
                    
                    cur = nums1[i];
                    i++;
                }
                else
                {
                    cur = nums2[j];
                    j++;
                }
            }
            else if(i < m)
            {
                cur = nums1[i];
                i++;
            }
            else if(j < n)
            {
                cur = nums2[j];
                j++;
            }
        }
        if((m+n) % 2 != 0)
            return cur;
        else
            return (double)(prev + cur) / 2.0;
    }
}