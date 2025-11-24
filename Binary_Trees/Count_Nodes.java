//problem link: https://leetcode.com/problems/count-complete-tree-nodes/description
//time complexity: O(n)
//space complexity: O(n) - skewed trees else O(logn)
/*logic: total no. of nodes = no.of nodes in the left subtree + no.of nodes in the
right subtree + root node
 */
class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        return 1+leftCount+rightCount;
    }
}