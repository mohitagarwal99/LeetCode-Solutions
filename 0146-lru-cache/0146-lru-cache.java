class LRUCache {

    int size;
    Node top, head;
    HashMap<Integer, Node> map;
    public LRUCache(int capacity) {
        size = capacity;
         map = new HashMap<>();
        head = new Node(0,0);
        top = head;
    }
    
    public int get(int key) {
        if( !map.containsKey(key) ){
            return -1;
        }
        Node temp = map.get(key);
        if(temp == top){
            return temp.val;
        }
        temp.prev.next = temp.next;
        
            temp.next.prev = temp.prev;
            temp.prev = top;
        top.next = temp;
            temp.next = null;
        
        top = temp;
        return top.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node old = map.get(key);
            if(old == top){
                top = top.prev;
                top.next = null;
            }
            else{
                old.prev.next = old.next;
                old.next.prev = old.prev;
            }
            map.remove(key);
            size++;
        }
        
        Node temp = new Node(key, value);
        top.next = temp;
        temp.prev = top;
        top = temp;
        if( size == 0){
            map.remove(head.next.key);
            head.next = head.next.next;
            head.next.prev = head;
            size++;
        }
        map.put(key, temp);
        size--;
        
    }
}

class Node{
    Node prev;
    Node next;
    int val;
    int key;
    public Node(int key, int val){
        this.key = key;
        this.val = val;
        next = null;
        prev = null;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */