class Links
{
    String val;
    Links next;
    Links(String val) {
        this.val = val;
        next = null;
    }
}
class BrowserHistory {

    Links hPage, cur;
    Stack<Links> st = new Stack<>();
    public BrowserHistory(String homepage) {
        hPage = new Links(homepage);
        st.push(hPage);
        cur = hPage;
    }
    
    public void visit(String url) {
        cur.next = new Links(url);
        cur = cur.next;
        st.push(cur);
    }
    
    public String back(int steps) {
       
        for(int i = 0; i < steps; i++) {
            if(st.size() == 1)
                break;
            st.pop();
        }
        cur = st.peek();
        return cur.val;
    }
    
    public String forward(int steps) {
        for(int i = 0; i < steps; i++)
        {
            if(cur.next == null)
                break;
            st.push(cur.next);
            cur = cur.next;
        }
        return cur.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */