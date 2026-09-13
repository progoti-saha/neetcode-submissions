class MinStack {
    Stack<Long> minStack = new Stack<>();
        long min;

    public MinStack() {
    }
    
    public void push(int val) {
        if(minStack.isEmpty()){
            min=val;
            minStack.push((long) val);
            
        }
        else if(val<=min){
            minStack.push(2L*val - min);
            min=val;
        }
        else
        minStack.push((long) val);
    }
    
    public void pop() {
        long t=minStack.pop();
        if(t<=min){
          min=2*min - t;
        }
    }
    
    public int top() {
        long t=minStack.peek();
        return (int)((t<=min) ? min : t); 
    }
    
    public int getMin() {
        return (int)min;
    }
}
