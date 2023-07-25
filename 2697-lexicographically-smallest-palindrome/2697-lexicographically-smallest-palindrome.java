class Solution {
    public String makeSmallestPalindrome(String s) {
        int n = s.length();
        StringBuilder s2 = new StringBuilder(s);
        for(int i = 0; i < n/2; i++)
        {
            if(s2.charAt(i) != s2.charAt(n-i-1))
            {
                if(s2.charAt(i) > s2.charAt(n-i-1))
                {
                    s2.replace(i, i+1, (s2.charAt(n-i-1))+"");
                }
                else
                {
                    s2.replace(n-i-1, n-i, (s2.charAt(i))+"");
                }
            }
        }
        return s2.toString();
    }
}