//problem link: https://leetcode.com/problems/binary-tree-preorder-traversal/description/
//time complexity: O(n)
//space complexity: O(n)
//preorder traversal: root -> left -> right
lass Solution {
public List<Integer> preorderTraversal(TreeNode root) {
    ArrayList<Integer> result = new ArrayList<>();
    if(root == null) return result;
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while(!stack.isEmpty()){
        TreeNode curr = stack.pop();
        result.add(curr.val);
        if(curr.right != null) stack.push(curr.right);
        if(curr.left != null) stack.push(curr.left);
    }
    return result;
}
}