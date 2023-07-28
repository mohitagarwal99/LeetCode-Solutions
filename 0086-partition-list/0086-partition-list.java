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
    public ListNode partition(ListNode head, int x) {
//         ListNode prev = null, large = head;
//         if(head == null)
//             return head;
//         while(large != null && large.val < x)
//         {
//             prev = large;
//             large = large.next;
//         }
        
//         if(large == null || large.next == null)
//             return head;
//         while(large != null && large.next != null)
//         {
            
//             if(large.next.val < x)
//             {
//                 ListNode temp = large.next;
//                 large.next = large.next.next;
//                 if(prev == null)
//                 {
//                     System.out.println(0);
//                     temp.next = head;
//                     head = temp;
//                     prev = head;
//                 }
//                 else
//                 {
//                     temp.next = prev.next;
//                     prev.next = temp;
//                     prev = prev.next;
//                 }
//                 continue;
//             }
//             large = large.next;
//         }
//         return head;
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        
        ListNode leftTail = left;
        ListNode rightTail = right;
        
        while(head != null){
            if(head.val < x){
                leftTail.next = head;
                leftTail = leftTail.next;
            }
            else{
                rightTail.next = head;
                rightTail = rightTail.next;
            }
            head = head.next;
        }
        
        leftTail.next = right.next;
        rightTail.next = null;
        
        return left.next;
    
    }
}