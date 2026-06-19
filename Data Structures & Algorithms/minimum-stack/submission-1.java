class MinStack {
    List<Integer> stack;
    int min;

    public MinStack() {
        stack = new LinkedList();
        min= Integer.MAX_VALUE;
        
    }
    
    public void push(int val) {
        if(val < min){
            min = val;
        }
        stack.add(val);
        
    }
    
    public void pop() {
        stack.remove(stack.size()-1);
        min = Integer.MAX_VALUE;
        calculateMin();
        
    }

    private void calculateMin(){
        for(int val:stack){
            if(val < min){
                min = val;
            }
        }
    }
    
    public int top() {

        int val = stack.get(stack.size()-1);

        // stack.remove(stack.size()-1);

        // min = Integer.MAX_VALUE;
        // calculateMin();

        return val;
        
    }
    
    public int getMin() {
        return min;
        
    }
}
