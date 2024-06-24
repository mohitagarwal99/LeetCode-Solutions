class Solution {
    // public int findKthLargest(int[] nums, int k) {
    //     PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
    //     for(int i = 0; i < nums.length; i++)
    //     {
    //         pq.add(nums[i]);
    //     }
    //     for(int i = 0; i < k-1; i++)
    //     {
    //         pq.poll();
    //     }
    //     return pq.poll();
    // }
    
    public int findKthLargest(int[] nums, int k) {
        
        int size = nums.length;
        k = size - k;
        int lo = 0; 
        int hi = size - 1;

        while( lo < hi){
            int j = partition(nums, lo, hi);
            if( j < k){
                lo = j + 1;
            }
            else if( j > k){
                hi = j - 1;
            }
            else{
                break;
            }

        }
        return nums[k];
    }

    public int partition(int[] a, int lo, int hi){
        int i = lo; 
        int j = hi + 1;

        while(true){
            while(i < hi && a[++i] < a[lo]);
            while(j > lo && a[lo] < a[--j]);

            if(i >= j){
                break;
            }

            swap(a, i, j);
        }

        swap(a, j, lo);
        return j;
    }
    public void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}