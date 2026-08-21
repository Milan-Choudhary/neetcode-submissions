class MinStack {

    Stack<Integer> st;
    Stack<Integer> stack;
    
    public MinStack() {
        
        st = new Stack<>();
        stack = new Stack<>();
       
    }
    
    public void push(int val) {
        
        if(stack.isEmpty()){
            stack.push(val);
        }
        else if(stack.peek() >= val){
            stack.push(val);
        }

       st.push(val);
        
    }
    
    public void pop() {

        if(stack.peek().equals(st.peek())){
            stack.pop();
        }

        st.pop();
        
    }
    
    public int top() {

        return st.peek();
        
    }
    
    public int getMin() {

        return stack.peek();     
    }
}
