//problem link: https://leetcode.com/problems/binary-tree-inorder-traversal/description/
//time complexity: O(n)
//space compelxity: O(n)
//inorder traversal: left -> root -> right
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }
    private void helper(TreeNode root, ArrayList<Integer> result){
        if(root == null) return;
        helper(root.left, result);
        result.add(root.val);
        helper(root.right, result);
    }
}