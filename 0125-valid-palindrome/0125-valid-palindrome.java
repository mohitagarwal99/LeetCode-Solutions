class Solution {
    public boolean isPalindrome(String s) {
        
        int i = 0, j = s.length()-1;
        while(i < j){
            while(i<j && !(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))){
                i++;
            }
            while(i<j && !(Character.isLetter(s.charAt(j)) || Character.isDigit(s.charAt(j)))){
                j--;
            }

            if(!(s.charAt(i)+"").equalsIgnoreCase(s.charAt(j)+""))
                return false;
            i++;
            j--;
            
        }
        return true;
    }
}