//problem link: https://leetcode.com/problems/remove-all-occurrences-of-a-substring/
//time complexity: O(n * m) where n = length of string, m = length of substring
//space complexity: O(n)
class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        while(true){
            int index = sb.indexOf(part);
            if(index == -1) break;
            sb.delete(index, index + part.length());
        }
        return sb.toString();
    }
}