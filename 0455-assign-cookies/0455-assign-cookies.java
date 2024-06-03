class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(s);
        Arrays.sort(g);
        int i = 0, j = 0;
        while(i < s.length && j < g.length){
            if(s[i] >= g[j])
            {
                count++;
                j++;
            }
            i++;
        }
        return count;
    }
}