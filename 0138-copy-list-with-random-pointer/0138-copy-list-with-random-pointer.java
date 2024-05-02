/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node itr = head, dummy = new Node(0);
        Node temp = dummy;
        while(itr != null){
            Node newNode = new Node(itr.val);
            newNode.next = itr.next;
            itr.next = newNode;
            itr = itr.next.next;
        }
        itr = head;
        while(itr != null){
            if(itr.random != null)
                itr.next.random = itr.random.next;
            itr = itr.next.next;
        }
        Node fast;
        itr = head;
        temp = dummy;
        while(itr != null)
        {
            fast = itr.next.next;
            temp.next = itr.next;
            itr.next = fast;
            temp = temp.next;
            itr = fast;
            
        }
        return dummy.next;
    }
}