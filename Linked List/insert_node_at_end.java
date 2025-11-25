//problem link: https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/1
//time complexity: O(n)
//space complexity: O(1)
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node temp = head;
        Node newNode = new Node(x);
        if(head == null) return newNode;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
}