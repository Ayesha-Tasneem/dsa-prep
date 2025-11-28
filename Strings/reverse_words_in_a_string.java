//problem link: https://leetcode.com/problems/reverse-words-in-a-string/
//time complexity: O(n)
//space complexity: O(n)
class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] parts = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = parts.length - 1; i >= 0; i--){
            sb.append(parts[i]);
            if(i != 0) sb.append(" ");
        }
        return sb.toString();
    }
}
