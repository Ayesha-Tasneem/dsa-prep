//problem link: https://leetcode.com/problems/valid-palindrome/
//time complexity: O(n)
//space complexity: O(n)
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                cleaned.append(Character.toLowerCase(c));
            }
        }
        String str = cleaned.toString();
        String rev = cleaned.reverse().toString();
        return str.equals(rev);
    }
}