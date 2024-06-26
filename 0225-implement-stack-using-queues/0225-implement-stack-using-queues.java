class MyStack {
    int q1[];
    int q2[];
    int front1, front2, rear1, rear2;
    boolean flip;
    public MyStack() {
        q1 = new int[100];
        q2 = new int[100];
        front1 = front2 = rear1 = rear2 = 0;
        flip = true;
    }
    
    public void push(int x) {
        if(flip){
            q1[rear1++] = x;
            while(front2 != rear2){
                q1[rear1++] = q2[front2++];
            }
            flip = false;
        }
        else{
            q2[rear2++] = x;
            while(front1 != rear1){
                q2[rear2++] = q1[front1++];
            }
            flip = true;
        }
    }
    
    public int pop() {
        if(empty()){
            return -1;
        }
        if(flip){
            return q2[front2++];
        }
            
        return q1[front1++];

    }
    
    public int top() {
        if(flip){
            return q2[front2];
        }
        
        return q1[front1];
    }
    
    public boolean empty() {
        if(flip){
            return front2 == rear2;
        }
        return front1 == rear1;
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */