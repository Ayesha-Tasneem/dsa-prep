//problem link: https://leetcode.com/problems/palindrome-linked-list/description/
//time complexity: O(n)
//space complexiy: O(1)
//reverse the second half and compare the two halves of the list
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode curr = slow;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode p1 = head;
        ListNode p2 = prev;
        while(p2 != null){
            if(p2.val != p1.val) return false;
            p2 = p2.next;
            p1 = p1.next;
        }
        return true;
    }
}