class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        HashMap<Integer,Integer> dp=new HashMap<>();//to store the max length of a subsequence at an index
        int n=arr.length;
        int ans=1;
        for(int i=0;i<n;i++)
        {
          if(dp.containsKey(arr[i]-difference))
          {
            dp.put(arr[i],dp.get(arr[i]-difference)+1);
          }else
          dp.put(arr[i],1);//a single element can be consisdered as a sequence

          ans=Math.max(ans,dp.get(arr[i]));
        }
        return ans;

    }
}