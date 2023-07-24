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
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList<ListNode> al = new ArrayList<>();
        while(head != null)
        {
            al.add(head);
            head = head.next;
        }
        //swapping
        ListNode temp = al.get(k-1);
        al.set(k-1, al.get(al.size() - k));
        al.set(al.size() - k, temp);
        
        //first element
        head = al.remove(0);
        temp = head;
        
        
        Iterator<ListNode> itr = al.iterator();
        while(itr.hasNext())
        {
            temp.next = itr.next();
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
}