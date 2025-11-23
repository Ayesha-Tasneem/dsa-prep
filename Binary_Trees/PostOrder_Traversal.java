//problem link: https://leetcode.com/problems/binary-tree-postorder-traversal/description/
//time complexity: O(n)
//space complexity: O(n)
//postorder traversal: left -> right -> root
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        helper(root,result);
        return result;
    }
    private void helper(TreeNode root, ArrayList<Integer> result){
        if(root == null) return;
        helper(root.left, result);
        helper(root.right, result);
        result.add(root.val);
    }
}
