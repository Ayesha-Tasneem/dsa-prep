//problem link: https://leetcode.com/problems/majority-element/description
//time complexity: O(n)
//space complexity: O(n)
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        int n = nums.length;
        for(int key : map.keySet()){
            if(map.get(key) > n/2){
                return key;
            }
        }
        return -1;
    }
}