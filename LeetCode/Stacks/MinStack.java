import java.util.Stack;

public class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStack() {
    }
    
    public void push(int val) {
        if(stack.isEmpty() && minStack.isEmpty()){
            stack.add(val);
            minStack.add(val);
        } else{
            stack.add(val);
            if(val > minStack.peek()){
                minStack.add(minStack.peek());
            } else {
                minStack.add(val);
            }
        }
        
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }

    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
        
    }

    public String toString(){
        return "\n" + stack.toString() + "\n" + minStack.toString();
    }

    public static void main(String[] args) {

        MinStack minStack = new MinStack();
        minStack.push(-3);
        minStack.push(0);
        minStack.push(-2);
        System.out.println(minStack.toString());
        // minStack.getMin(); // return -3
        // minStack.pop();
        // minStack.top();    // return 0
        // minStack.getMin(); // return -2
        

        
    }

}
