class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length, i, j;
        for(i = n-2; i >=0; i--)
        {
            if(nums[i] < nums[i+1])
                break;
        }
        if(i < 0)
        {
            reverse(nums, 0, n);
        }
            
        else
        {
            for(j = n-1; j > i; j--)
            {
                if(nums[j] > nums[i])
                    break;
            }
            swap(nums, i, j);
            reverse(nums, i+1, n);
        }
    }
    public void reverse(int arr[], int start, int end)
    {
        while(start < end-1)
        {
            swap(arr, start, end-1);
            start++;
            end--;
        }
    }
    public void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}