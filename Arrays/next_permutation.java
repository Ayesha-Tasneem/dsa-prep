//problem link: https://leetcode.com/problems/next-permutation/description/
//time complexity: O(n)
//space complexity: O(1)

class Solution {
    public void nextPermutation(int[] nums) {
        //start with second last element
        int i = nums.length - 2;
        //select pivot element to check the decreasing element
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        if(i >= 0){
            //find where to swap
            int j = nums.length - 1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums, i+1, nums.length - 1);
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}