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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
            return head;
        int len = 0;
        ListNode temp = head, temp2 = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        
        if(k % len == 0)
            return head;
        
        temp = head;
        int n = len - (k % len);
        while(n-- != 1){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = temp2;
        return head;
    }
    
    
}