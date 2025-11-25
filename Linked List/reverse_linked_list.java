//problem link: https://leetcode.com/problems/reverse-linked-list/description/
//time complexity: O(n)
//space complexity: O(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}