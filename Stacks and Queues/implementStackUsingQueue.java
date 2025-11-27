//problem link: https://leetcode.com/problems/implement-stack-using-queues/description/
//time complexity: push : O(n), pop: O(1)
//space complexity: O(n)
//two queues
/*
q1 [     ]
q2 [     ]
 */
class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public MyStack() {

    }

    public void push(int x) {
        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        q1.offer(x);
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
    }

    public int pop() {
        int ans = q1.poll();
        return ans;
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
