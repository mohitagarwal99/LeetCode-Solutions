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
    public void reorderList(ListNode head) {
        if(head.next == null)
            return;
        ArrayList<Integer> al = new ArrayList<>();
        ListNode temp = head.next;
        while(temp != null)
        {
            al.add(temp.val);
            temp = temp.next;
        }
        head.next = new ListNode(al.remove(al.size()-1));
        temp = head.next;
        int size = al.size();
        for(int i = 0; i < size/2; i++)
        {
            temp.next = new ListNode(al.remove(0));
            temp.next.next = new ListNode(al.remove(al.size() - 1));
            temp = temp.next.next;
        }
        if(!al.isEmpty())
            temp.next = new ListNode(al.remove(0));
    }
}