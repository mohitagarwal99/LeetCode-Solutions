/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> map = new HashSet<>();
        while(head != null)
        {
            if(!map.add(head))
                return head;
            head = head.next;
        }
        return null;
    }
}