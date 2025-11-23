//problem link : https://leetcode.com/problems/binary-tree-preorder-traversal/description/
//time complexity: O(n)
//space complexity: O(n)
//preorder - root -> left -> right
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;

    }
    private void helper(TreeNode root, ArrayList<Integer> result){
        if(root == null) return;
        result.add(root.val);
        helper(root.left, result);
        helper(root.right, result);
    }
}