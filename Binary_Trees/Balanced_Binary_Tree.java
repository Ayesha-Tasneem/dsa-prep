//problem link: https://leetcode.com/problems/balanced-binary-tree/description/
//time complexity: O(n)
//space complexity: O(h) where h is the height of the tree
//balanced tree = for every node, height of left - height of right <= 1
class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }
    private int checkHeight(TreeNode root){
        if(root == null) return 0;
        int left = checkHeight(root.left);
        if(left == -1) return -1;
        int right = checkHeight(root.right);
        if(right == -1) return -1;
        if(Math.abs(left - right) > 1) return -1;
        return Math.max(left,right) + 1;
    }
}