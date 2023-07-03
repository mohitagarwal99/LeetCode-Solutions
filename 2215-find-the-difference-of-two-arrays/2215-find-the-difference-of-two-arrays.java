class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        ArrayList<Integer> temp2 = new ArrayList<Integer>();
        for(int i = 0; i < nums2.length; i++)
        {
            temp.add(nums2[i]);
        }
        List<Integer> ls = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++)
        { 
            if(!temp.contains(nums1[i]))
            {
                ls.add(nums1[i]);
                temp.add(nums1[i]);
            }
            temp2.add(nums1[i]);
        }
        
        for(int i = 0; i < nums2.length; i++)
        {
            if(!temp2.contains(nums2[i]))
            {
                ls2.add(nums2[i]);
                temp2.add(nums2[i]);
            }
        }
        ans.add(ls);
        ans.add(ls2);
        return ans;
        
    }
}