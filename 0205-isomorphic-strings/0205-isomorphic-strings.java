class Solution {
    public boolean isIsomorphic(String s, String t) {
//         Map<Character, Character> hashMap = new HashMap<>();
//         for(int i = 0; i < s.length(); i++)
//         {
//             char key = s.charAt(i);
//             char value = t.charAt(i);
//             if(hashMap.containsKey(key) && hashMap.get(key) != value)
//             {

//                 return false;
//             }
//             else if(!hashMap.containsKey(key) && hashMap.containsValue(value))
//             {

//                 return false;
//             }
//             else
//             {

//                 hashMap.put(key, value);
//             }
//         }
//         return true;
        int[] a = new int[256];
        int b[] = new int[256];
        for(int i = 0; i < s.length(); i ++)
        {
            if(a[s.charAt(i)] != b[t.charAt(i)])
                return false;
            a[s.charAt(i)] = i+1;
            b[t.charAt(i)] = i+1;
        }
        return true;
    }
}