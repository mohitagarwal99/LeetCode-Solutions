class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '#')
            {
                if(!st1.isEmpty())
                    st1.pop();
                continue;
            }
            st1.push(s.charAt(i));
        }
        for(int i = 0; i < t.length(); i++)
        {
            if(t.charAt(i) == '#')
            {
                if(!st2.isEmpty())
                    st2.pop();
                continue;
            }
            st2.push(t.charAt(i));
        }
        if(st1.size() != st2.size())
            return false;
        int l = st1.size();
        for(int i = 0; i < l; i++)
        {
            char a = st1.pop();
            char b = st2.pop();
 
            if(a != b)
                return false;
        }
        return true;
    }
}