class Solution {
    public int countSegments(String s) {
        int size = s.length();
        if(size == 0)
            return 0;
        int count = 0, i = 0;
        boolean space = true;
        while(i < size)
        {
            if(s.charAt(i) != ' ' && space)
            {
                count++;
                space = false;
            }
            else if(s.charAt(i) == ' ')
            {
                space = true;
            }
                
            i++;
        }

        return count;
    }
}