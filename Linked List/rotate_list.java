//problem link: https://leetcode.com/problems/rotate-list/
//time complexity: O(n)
//space complexity: O(1)
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        ListNode tail = head;
        int len = 1;
        while(tail.next != null){
            tail = tail.next;
            len++;
        }
        tail.next = head;
        k = k % len;
        //calculate the number of times to move to get new head
        int steps = len - k;
        ListNode newTail = tail;
        ListNode newHead = null;
        for(int i = 0; i < steps; i++){
            newTail = newTail.next;
        }
        newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}