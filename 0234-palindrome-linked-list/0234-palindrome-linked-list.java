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
    // ListNode temp;
    // boolean flag = true;
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next ==null)
            return true;
        // temp = head;
        // check(head);
        // return flag;
        ListNode second = head, first = head;
        while(first != null && first.next != null)
        {
            second = second.next;
            first = first.next.next;
        }
        second = reverse(second);
        return check(head, second);  
    }
    
    public boolean check(ListNode first, ListNode second){
        
        while(second != null){
            if(second.val != first.val)
                return false;
            second = second.next;
            first = first.next;
        }
        return true;
    }
    
    public ListNode reverse(ListNode head){
        ListNode prev = null, next;
        while(head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    
    // public void check(ListNode head)
    // {
    //     if(head == null)
    //         return;
    //     check(head.next);
    //     System.out.println(head.val + " "+ temp.val);
    //     if(head.val != temp.val)
    //     {
    //         flag = false;
    //     }
    //     temp = temp.next;
    // }
}
