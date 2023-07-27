/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode middle = getMiddle(head);
        ListNode next = middle.next;
        
        middle.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(next);
        
        return sortedMerge(left, right);
    }
    
    public ListNode getMiddle(ListNode head)
    {
        if (head == null)
            return head;
 
        ListNode slow = head, fast = head;
 
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode sortedMerge(ListNode l1, ListNode l2)
    {
        ListNode result = null;
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        
        if(l1.val <= l2.val)
        {
            result = l1;
            result.next = sortedMerge(l1.next, l2);
        }
        else
        {
            result = l2;
            result.next = sortedMerge(l1, l2.next);
        }
        return result;
    }
}