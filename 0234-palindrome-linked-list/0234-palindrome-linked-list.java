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
    ListNode temp;
    boolean flag = true;
    public boolean isPalindrome(ListNode head) {
        temp = head;
        check(head);
        return flag;
    }
    
    public void check(ListNode head)
    {
        if(head == null)
            return;
        check(head.next);
        System.out.println(head.val + " "+ temp.val);
        if(head.val != temp.val)
        {
            flag = false;
        }
        temp = temp.next;
    }
}
