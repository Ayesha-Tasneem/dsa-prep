//problem link: https://www.geeksforgeeks.org/problems/insert-in-middle-of-linked-list/1
//time complexity: O(n)
//space complexity: O(1)
class Solution {
    public Node insertInMiddle(Node head, int x) {
        // Code here
        Node newNode = new Node(x);
        if(head == null) return newNode;
        if(head.next == null){
            head.next = newNode;
            return head;
        }
        Node fast = head;
        Node slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        newNode.next = slow.next;
        slow.next = newNode;
        return head;
    }
}