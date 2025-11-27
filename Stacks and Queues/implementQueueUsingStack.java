//problem link: https://leetcode.com/problems/implement-queue-using-stacks/description/
//time complexity: push: O(n), pop = O(n)
//space complexity: O(n)
class MyQueue {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    public MyQueue() {

    }

    public void push(int x) {
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        st1.push(x);
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
    }

    public int pop() {
        int ans = st1.pop();
        return ans;
    }

    public int peek() {
        return st1.peek();
    }

    public boolean empty() {
        return st1.isEmpty();
    }
}
