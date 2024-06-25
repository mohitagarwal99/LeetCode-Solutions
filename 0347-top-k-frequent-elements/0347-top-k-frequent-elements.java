class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[1], b[1]));
        
        for(Integer n: map.keySet()){
            pq.add(new int[]{n, map.get(n)});
            
            
            if(pq.size() > k){
                pq.poll();
            }
        }
        int ans[] = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = pq.poll()[0];
        }
        return ans;
    }
}