//problem link: https://www.geeksforgeeks.org/problems/longest-subarray-with-sum-divisible-by-k1259/1
//time complexity: O(n)
//space complexity: O(n)
//Use hashmap to store the remainders
// User function Template for Java

class Solution {
    int longestSubarrayDivK(int[] arr, int k) {
        //create a hashmap to store remainders
        Map<Integer, Integer> map = new HashMap<>();
        //remainder 0 at index -1
        map.put(0,-1);
        long prefix = 0;
        int maxLen = 0;
        for(int i = 0; i < arr.length; i++){
            //keep adding the numbers
            prefix = arr[i] + prefix;
            //calculate the remainder
            int rem = (int)(prefix % k);
            //handle negative cases
            if(rem < 0) rem += k;
            //check the hashmp for already existing remainder
            if(map.containsKey(rem)){
                //if yes, calculate the length of the subarray
                int len = i - map.get(rem);
                //calculate maximum subarray length
                maxLen = Math.max(maxLen, len);
            }
            else{
                map.put(rem,i);
            }
        }
        return maxLen;
    }
}
