class Solution {
    public int reversePairs(int[] nums) {
        System.out.println(nums[0] * 2);
        return sortAndCount(nums, 0, nums.length - 1);
    }
    public int sortAndCount(int[] nums, int low, int high){
        int cnt = 0;
        if(low >= high)
            return cnt;
        int mid = (low + high) / 2;
        cnt += sortAndCount(nums, low, mid);
        cnt += sortAndCount(nums, mid+1, high);
        cnt += countPairs(nums, low, mid, high);
        merge(nums, low, mid, high);
        return cnt;
    }
    
    public int countPairs(int[] nums, int low, int mid, int high){
        int right = mid + 1;
        int cnt = 0;
        for( int i = low; i <= mid; i++)
        {
            while(right <= high && (double)nums[i]/2 > (double) nums[right])
                right++;
            cnt += (right - (mid + 1));
        }
        return cnt;
    }
    
    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}