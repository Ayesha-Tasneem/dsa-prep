//problem link: https://takeuforward.org/plus/dsa/problems/second-largest-element
//time complexity: O(n)
//space complexity: O(1)
class Solution {
    public int secondLargestElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num : nums){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }
            else if(num > secondLargest && num < largest){
                secondLargest = num;
            }
        }
        if(secondLargest == Integer.MIN_VALUE) return -1;
        return secondLargest;
    }
}