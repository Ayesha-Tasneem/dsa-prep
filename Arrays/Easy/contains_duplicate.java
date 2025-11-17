//problem link: https://leetcode.com/problems/contains-duplicate/description/
//time complexity: O(n)
//space complexity: O(n) - worst case every element is unique
import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            else{
                set.add(num);
            }
        }
        return false;
    }
}