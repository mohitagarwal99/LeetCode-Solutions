class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    //     int i = 0, j = 0, k = 0;
    //     int sorted[] = new int[m+n];
    //     while(i < m && j < n)
    //     {
    //         if(nums1[i] <= nums2[j])
    //         {
    //             sorted[k] = nums1[i];
    //             i++;
    //             k++;
    //         }
    //         else{
    //             sorted[k] = nums2[j];
    //             j++;
    //             k++;
    //         }
    //     }
    //     while(i < m)
    //     {
    //         sorted[k] = nums1[i];
    //         i++;
    //         k++;
    //     }
    //     while(j < n)
    //     {
    //         sorted[k] = nums2[j];
    //         j++;
    //         k++;
    //     }
    //     for(int a = 0; a < nums1.length; a++)
    //     {
    //         nums1[a] = sorted[a];
    //     }
        
        
        //without extra space
        int i = m - 1, j = n - 1, k = m+n-1;
        while(i >= 0 && j >= 0)
        {
            if(nums1[i] >= nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else{
                nums1[k--] = nums2[j--];
            }
        }
        while(i >= 0){
            nums1[k--] = nums1[i--];
        }
        while(j >= 0){
            nums1[k--] = nums2[j--];
        }
    }
}