class Solution {
    public long countCompleteDayPairs(int[] hours) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long count = 0;
        for( int i: hours){
            int temp = (24 - (i % 24)) % 24;

            
            if (map.containsKey(temp)){
                count += map.get(temp);
            }
            map.put(i % 24, map.getOrDefault(i % 24 , 0) + 1);
        }
        
        return count;
    }
}