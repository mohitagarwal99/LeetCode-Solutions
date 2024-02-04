class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        TreeSet<Integer> list = new TreeSet<>();
        for(int n: nums){
            list.add(n);
        }
        Iterator<Integer> itr = list.iterator();
        int count = 1; 
        int max = 1;
        int prev = itr.next();
        while(itr.hasNext()){
            int next = itr.next();
            if(prev + 1 == next)
            {
                count++;
            }
                
            else{
                count = 1;
            }
            prev = next;
            max = Math.max(max, count);
            
        }
        return max;
    }
}