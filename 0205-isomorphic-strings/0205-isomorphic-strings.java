class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> hashMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
        {
            char key = s.charAt(i);
            char value = t.charAt(i);
            if(hashMap.containsKey(key) && hashMap.get(key) != value)
            {

                return false;
            }
            else if(!hashMap.containsKey(key) && hashMap.containsValue(value))
            {

                return false;
            }
            else
            {

                hashMap.put(key, value);
            }
        }
        return true;
    }
}