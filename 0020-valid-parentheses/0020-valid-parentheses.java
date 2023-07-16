class Solution {
    public boolean isValid(String s) {
        int i = 0;
        Stack<Character> st = new Stack<>();
        while(i < s.length())
        {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[')
            {
                st.push(c);
            }
            else 
            {
                if(st.empty())
                    return false;
                switch(c)
                {
                    case '}': if(st.pop() != '{') return false;
                                break;
                    case ']': if(st.pop() != '[') return false;
                                break;
                    case ')': if(st.pop() != '(') return false;
                                break;
                        
                }
            }
            i++;
        }
        if(!st.empty())
            return false;
        return true;
    }
}