class Solution {
    public String getPermutation(int n, int k) {
        List<Character> ch = new ArrayList<>();
        String ans = "";
        for(int i = 1; i <= n; i++){
            ch.add((char)('0' + i));
        }
        ans = perSequence(ch, n, k, ans);
        return ans;
    }
    
    public String perSequence(List<Character> ch, int n, int k, String ans){
        if(n == 0){
            return ans;
        }
        
        int total = permutation(n) / n;
        if(k % total == 0){
            
            ans += ch.remove(k/total - 1);
            System.out.println(ans + " " + k);
            return perSequence(ch, n-1, k - total*(k/total - 1), ans);
        }
        else{
            
            ans += ch.remove(k/total);
            System.out.println(ans + " " + k);
            return perSequence(ch, n-1, k - total*(k/total), ans);
        }
        
        
    }
    
    public int permutation(int n)
    {
        if(n == 0 || n == 1)
            return 1;
        return n * permutation(n-1);
    }
}