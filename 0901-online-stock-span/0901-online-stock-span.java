class StockSpanner {

    Stack<int[]> st = new Stack<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int arr[] = {price, 1};
        while(!st.isEmpty() && st.peek()[0] <= arr[0])
        {
            arr[1] += st.peek()[1];
            st.pop();
        }
        st.add(arr);
        return arr[1];
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */