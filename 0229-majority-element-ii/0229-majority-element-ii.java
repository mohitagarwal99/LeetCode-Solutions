class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        //using sorting
        
        // Arrays.sort(nums);
         List<Integer> al = new ArrayList<Integer>();
         int check = nums.length/3;
        // int count = 1;
        // for(int i = 1; i < nums.length; i++)
        // {
        //     if(nums[i] != nums[i-1])
        //     {
        //         if(count > check)
        //         {
        //             al.add(nums[i-1]);
        //         }
        //         count = 0;
        //     }
        //     count++;
        // }
        // if(count > check){
        //     al.add(nums[nums.length-1]);
        // }
        
        int count1 = 0, count2 = 0;
        int element1 = nums[0], element2 = Integer.MAX_VALUE;
        
        
        for(int i = 0; i < nums.length; i++){
            if(element1 == nums[i])
                count1++;
            else if(element2 == nums[i])
                count2++;
            else{
                if(count1 == 0){
                    element1 = nums[i];
                    count1++;
                }
                else if(count2 == 0){
                    element2 = nums[i];
                    count2++;
                }
                else{
                    count1--;
                    count2--;
                }
                    
            }
        }
        count1 = 0; count2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == element1)
            {
                count1++;
            }
            else if(nums[i] == element2)
            {
                count2++;
            }
        }
        if(count1 > check)
            al.add(element1);
        if(count2 > check)
            al.add(element2);
           

         return al;
        
        
    }
}