class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        String ans = "";
        Stack<Character> st = new Stack<>();
        int start = 0; 
        for(int i = 0; i < n; i++)
        {
            if(s.charAt(i) == '(')
                st.push('(');
            
            else if(s.charAt(i) == ')')
            {
                st.pop();
            }
            
            if(st.empty())
            {
                ans += s.substring(start+1, i);
                start = i+1;
            }
        }
        return ans;
    }
}