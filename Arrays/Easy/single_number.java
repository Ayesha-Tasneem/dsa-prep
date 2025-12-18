//problem link: https://leetcode.com/problems/single-number/
//time complexity: O(n)
//space complexity: O(1)
//XOR rule: same - 0, different - 1
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums){
            result ^= num;
        }
        return result;
    }
}