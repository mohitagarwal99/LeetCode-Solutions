class Solution {
    public String makeSmallestPalindrome(String s) {
        int n = s.length();
        StringBuilder s2 = new StringBuilder();
        for(int i = 0; i < n; i++)
        {
           s2.append(Character.toString(Math.min(s.charAt(i), s.charAt(n - i - 1))));
        }
        return s2.toString();
    }
}