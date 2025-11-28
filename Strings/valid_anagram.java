//problem link: https://leetcode.com/problems/valid-anagram/description/
//time complexity: O(n log n + m log m)
//space complexity: O(n + m)
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] schars = s.toCharArray();
        char[] tchars = t.toCharArray();
        Arrays.sort(schars);
        Arrays.sort(tchars);
        return Arrays.equals(schars,tchars);
    }
}