class MinStack {
    Stack<Integer> element = new Stack<>();
    
    int min = Integer.MAX_VALUE;
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(val <= min)
        {
            element.push(min);
            min = val;
        }
        element.push(val);
        
    }
    
    public void pop() {
        if(element.pop() == min)
            min = element.pop();
    }
    
    public int top() {
        return element.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */