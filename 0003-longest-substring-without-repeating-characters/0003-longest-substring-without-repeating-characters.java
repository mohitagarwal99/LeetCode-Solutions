class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size = s.length();
        if(size <  2)
            return size;
        
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, grThan = 0;
        int max = 0;
        int len = 0;
        while(i < size)
        {
            
            char c = s.charAt(i);
            if(map.containsKey(c) && map.get(c) >= grThan)
            {
                max = Math.max(max, i-grThan);
                grThan = map.get(c)+1;
                len = i - map.get(c);
                
            }
            else{
                len++;
            }
            
            
            map.put(c, i);
            i++;
        }
        
        return Math.max(max, len);
    }
}