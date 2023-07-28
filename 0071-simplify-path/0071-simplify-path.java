class Solution {
    public String simplifyPath(String path) {
        int size = path.length();
        StringBuilder sb = new StringBuilder();
        if(size == 1)
            return path;
        Stack<Integer> prev = new Stack<>();
        String words[] = path.split("[/]");
        for(String s: words)
        {
            if(s.equals("") || s.equals("."))
                continue;
            else if(s.equals(".."))
            {
                if(sb.length() == 0)
                    continue;
                else
                {
                    sb.delete(sb.length() - prev.pop() - 1, sb.length());
                    continue;
                }
            }
            sb.append("/");
            sb.append(s);
            prev.push(s.length());
        }
        if(sb.length() == 0)
            return "/";
        return sb.toString();
        
    }
}