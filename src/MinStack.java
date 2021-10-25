import java.util.*;
class MinStack {

    private Stack<Integer> s;
    private ArrayList<Integer> a=new ArrayList<>();
    public MinStack() {
        s=new Stack<>();
    }

    public void push(int val) {
        s.push(val);
        a.add(val);
    }

    public void pop() {
        s.pop();
        a.remove(a.size()-1);
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.size();i++){
            if(a.get(i)<min){
                min=a.get(i);
            }
        }
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