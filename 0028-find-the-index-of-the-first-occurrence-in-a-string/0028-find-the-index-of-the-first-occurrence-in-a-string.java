class Solution {
    public int strStr(String hay, String nee) {
        int i = 0, j = 0;
        while(i < hay.length())
        {
            if( j < nee.length() && hay.charAt(i) == nee.charAt(j))
            {
                j++;
            }
            else
            {
                i = i - j;
                j = 0;
            }
            if(j == nee.length())
                return i - nee.length() +1;
            i++;
        }
        return -1;
    }
}