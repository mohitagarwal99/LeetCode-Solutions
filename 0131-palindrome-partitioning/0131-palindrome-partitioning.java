class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        
        partition(s, ans, s.length(), 0, new ArrayList<>());
        
        
        return ans;
        
    }
    
    
    public void partition(String s, List<List<String>> ans, int n, int ind, List<String> list){
        if(ind == n)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for (int i = ind; i < n; ++i) {
            if (isPalindrome(s, ind, i)) {
                list.add(s.substring(ind, i + 1));
                partition(s, ans, n, i + 1, list);
                list.remove(list.size() - 1);
            }
        }
        
    }
    
    public boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }
    
}