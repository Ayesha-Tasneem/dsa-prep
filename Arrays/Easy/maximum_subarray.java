//problem link: https://leetcode.com/problems/maximum-subarray/description/
//time complexity: O(n)
//space complexity: O(1)
//Kadane's Algorithm

class Solution {
    public int maxSubArray(int[] nums) {
        int current = 0;
        int max = nums[0];
        for(int num : nums){
            current += num;
            max = Math.max(current,max);
            //handles negative values
            if(current < 0) current = 0;
        }
        return max;
    }
}