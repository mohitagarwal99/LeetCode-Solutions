class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int nums : nums2)
        {
            while(!stack.isEmpty() && stack.peek() < nums)
            {
                map.put(stack.pop(), nums);
            }
            stack.push(nums);
        }
        
        for(int i = 0; i < nums1.length; i++)
        {
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }
}