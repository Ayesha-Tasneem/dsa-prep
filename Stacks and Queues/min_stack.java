//problem link: https://leetcode.com/problems/min-stack/description/
//time complexity: O(1)
//space complexity: O(1) - worst case element sorted in descending order
class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public MinStack() {

    }

    public void push(int val) {
        st.push(val);
        if(min.isEmpty() || val <= min.peek()){
            min.push(val);
        }
    }

    public void pop() {
        int removed = st.pop();
        if(removed == min.peek()){
            min.pop();
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
