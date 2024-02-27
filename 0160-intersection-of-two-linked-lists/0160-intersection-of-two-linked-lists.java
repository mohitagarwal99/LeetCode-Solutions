/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
//         ListNode temp = headA;
//         int lenA = 0, lenB = 0;
        
//         while(temp != null){
//             temp = temp.next;
//             lenA++;
//         }
        
//         temp = headB;
//         while(temp != null){
//             temp = temp.next;
//             lenB++;
//         }
        
//         if(lenA > lenB)
//         {
//             temp = intersectingNode(headA, headB, lenA-lenB);
//         }
//         else
//         {
//             temp = intersectingNode(headB, headA, lenB-lenA);
//         }
            
//         return temp;
        
        
        //Optimized version:
        ListNode tempA = headA, tempB = headB;
        
        while(tempA != null || tempB != null){
            
            if(tempA == tempB)
                return tempA;
            
            if(tempA == null)
                tempA= headB;
            else
            {
                tempA = tempA.next;
            }
            
            if(tempB == null)
                tempB = headA;
            else
            {
                tempB = tempB.next;
            }
        }
        
        return null;
    }
//     public ListNode intersectingNode(ListNode headA, ListNode headB, int skip){
        
//         while(skip-- != 0){
//             headA = headA.next;
//         }
        
//         while(headA != null){
//             if(headA == headB)
//                 return headA;
//             headA = headA.next;
//             headB = headB.next;
//         }
        
//         return null;
        
//     }
}