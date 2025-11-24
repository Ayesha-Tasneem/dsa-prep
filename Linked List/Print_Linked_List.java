//problem link: https://www.geeksforgeeks.org/problems/print-linked-list-elements/1
//time complexity: O(n)
//space complexity: O(n) output space
class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        while(head != null){
            result.add(head.data);
            head = head.next;
        }
        return result;
    }
}