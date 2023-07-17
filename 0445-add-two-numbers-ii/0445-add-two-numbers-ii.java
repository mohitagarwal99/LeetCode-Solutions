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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        
        while(l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        };
        while(l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        
        int sum = 0;
        ListNode list = new ListNode(0);
        while (!s1.empty() || !s2.empty()) {
            if (!s1.empty()) sum += s1.pop();
            if (!s2.empty()) sum += s2.pop();
            list.val = sum % 10;
            ListNode head = new ListNode(sum / 10);
            head.next = list;
            list = head;
            sum /= 10;
        }
        
        return list.val == 0 ? list.next : list;
    }
//     int carry = 0;
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         int size1 = 0, size2 = 0;
//         ListNode temp1 = l1, temp2 = l2;
//         while(temp1 != null && temp2 != null)
//         {
//             size1++;
//             size2++;
//             temp1 = temp1.next;
//             temp2 = temp2.next;
//         }
//         while(temp1 != null)
//         {
//             size1++;
//             temp1 = temp1.next;
//         }
//         while(temp2 != null)
//         {
//             size2++;
//             temp2 = temp2.next;
//         }
//         temp1 = l1; temp2 = l2;
//         if (size1 > size2)
//         {
            
//             for(int i = 1; i <= size1-size2; i++)
//             {
//                 temp1 = temp1.next;
//             }
//             add(temp1, temp2);
//             addRemaining(l1, l2, size1 - size2);
//         }
//         else
//         {
//             for(int i = 1; i <= size2-size1; i++)
//             {
//                 temp2 = temp2.next;
//             }
//             add(temp2, temp1);
//             addRemaining(l2, l1, size2 - size1);
//         }
//     }
//     public void add(ListNode l1, ListNode l2)
//     {
//         if(l1 == null)
//             return;
//         add(l1.next, l2.next);
//         int sum = l1.val + l2.val;
//         l2.val = (sum + carry) % 10;
//         carry = (sum + carry) / 10;
        
//     }
//     public void addRemaining(ListNode l1, ListNode l2, int size)
}