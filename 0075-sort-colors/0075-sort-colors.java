class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int hash[] = new int[3];
        for(int i = 0; i < n; i++)
        {
            hash[nums[i]]++;
        }
        int i, j =0;
        for(i = 0; i < hash[0]; i++)
        {
            nums[j] = 0;
            j++;
        }
        for( i = 0; i < hash[1]; i++)
        {
            nums[j] = 1;
            j++;
        }
        for(i = 0; i < hash[2]; i++)
        {
            nums[j] = 2;
            j++;
        }
    }
}