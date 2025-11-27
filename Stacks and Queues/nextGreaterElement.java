//problem link: https://leetcode.com/problems/next-greater-element-i/
//time complexity: O(n)
//space complexity: O(n)
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = nums2.length - 1; i >= 0; i--){
            //if the elements are smaller pop them
            while(!stack.isEmpty() && stack.peek() <= nums2[i]){
                stack.pop();
            }
            //next greater element is zero is stack is empty else top of the stack
            int next = stack.isEmpty() ? -1 : stack.peek();
            //push the number into the stack
            stack.push(nums2[i]);
            map.put(nums2[i], next);
        }
        int[] ans = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}