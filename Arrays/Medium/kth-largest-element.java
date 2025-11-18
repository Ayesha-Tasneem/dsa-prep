//problem link: https://leetcode.com/problems/kth-largest-element-in-an-array/description/
//time complexity: O(n log k) n * log k
//space complexity: O(k) storing only k elements
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : nums){
            minHeap.offer(num);
            if(minHeap.size() > k){
                //pop smallest element
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}

