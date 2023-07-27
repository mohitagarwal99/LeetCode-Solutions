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
    public ListNode removeElements(ListNode head, int val) {
        
    // Recursive approach
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
        
        
        // if(head == null)
        //     return head;
        // ListNode temp = head;
        // while(temp.next != null)
        // {
        //     if(temp.next.val == val)
        //     {
        //         temp.next = temp.next.next;
        //         continue;
        //     }
        //     temp = temp.next;
        // }
        // if(head.val == val)
        // {
        //     head = head.next;
        // }
        // return head;
    }
}