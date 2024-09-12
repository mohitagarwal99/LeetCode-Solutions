class Solution {
   public void rotate(int[] nums, int k) {
    int len = nums.length;
    k = k % len; // Handle cases where k > len
    
    if (k == 0 || len == 1) {
        return; // No need to rotate
    }
    
    int count = 0; // Tracks the number of elements rotated
    for (int start = 0; count < len; start++) {
        int current = start;
        int prev = nums[start];
        
        do {
            int next = (current + k) % len; // Find the next index
            int temp = nums[next]; // Store the next value
            nums[next] = prev; // Replace the next value with current
            prev = temp; // Update prev with the next value
            current = next; // Move to the next index
            count++; // Increase the rotated elements count
        } while (start != current); // End the cycle when back to the start
    }
}

}