class Solution {
    public int maxDepth(String s) {
//         Stack<Character> st = new Stack<>();
//         int n = s.length();
//         int count = 0;
//         for(int i = 0; i < n; i++)
//         {
//             if(s.charAt(i) == '(')
//             {
//                 st.push('(');
//                 count = Math.max(st.size(), count);
//             }
//             else if(s.charAt(i) == ')')
//             {
//                 st.pop();
//             }
            
//         }
        int n = s.length();
        int count = 0, curr = 0;
        for(int i = 0; i < n; i++)
        {
            if(s.charAt(i) == '(')
            {
                curr++;
                count = Math.max(curr, count);
            }
            else if(s.charAt(i) == ')')
            {
                curr--;
            }
            
        }
        return count;
    }
}