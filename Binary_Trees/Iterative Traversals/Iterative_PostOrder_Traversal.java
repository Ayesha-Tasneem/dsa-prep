//problem link: https://leetcode.com/problems/binary-tree-postorder-traversal/description/
//time complexity: O(n)
//space complexity: O(n)
//post order traversal: left -> right -> root
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        if(root == null) return result;
        st1.push(root);
        while(!st1.isEmpty()){
            root = st1.pop();
            st2.push(root);
            if(root.left != null) st1.push(root.left);
            if(root.right != null) st1.push(root.right);
        }
        while(!st2.isEmpty()){
            result.add(st2.pop().val);
        }
        return result;
    }
}
