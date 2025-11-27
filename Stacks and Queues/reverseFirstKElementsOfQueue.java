//problem link: https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1
//time complexity: O(n)
//space complexity: O(k)
class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        if(k <= 0 || k > q.size()) return q;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < k; i++){
            //stack automatically reverses it while pushing
            stack.push(q.poll());
        }
        while(!stack.isEmpty()){
            q.offer(stack.pop());
        }
        int rem = q.size() - k;
        for(int i = 0; i < rem; i++){
            q.offer(q.poll());
        }
        return q;
    }
}