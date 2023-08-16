class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) == '*'){
                st.pop();
                continue;
            }
            st.push(s.charAt(i));   
        }
        StringBuilder sb = new StringBuilder();
        for(Character c : st)
        {
            sb.append(c);
        }
        return sb.toString();
    }
}