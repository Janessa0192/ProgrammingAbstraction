class MinStack {

    Stack<Integer> st;
    Stack<Integer> mst;


    public MinStack() {
        
        st = new Stack<>();
        mst = new Stack<>();
    }
    
    public void push(int value) {
        
        st.push(value);

        if(mst.isEmpty() || mst.peek()>=value){
            mst.push(value);
        }

    }
    
    public void pop() {
        
        if(st.peek().equals(mst.peek())){
            mst.pop(); st.pop();
        } else{
            st.pop();
        }
        
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        
        return mst.peek();
    }
}
