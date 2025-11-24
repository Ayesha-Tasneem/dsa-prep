//problem link: https://leetcode.com/problems/binary-tree-postorder-traversal/description/
//time complexity: O(n)
//space complexity: O(n)
//post order traversal: left -> right -> root

//two stack
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

//single stack
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        TreeNode lastVisited = null;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            TreeNode peekNode = stack.peek();
            if (peekNode.right == null || peekNode.right == lastVisited) {
                result.add(peekNode.val);
                lastVisited = peekNode;
                stack.pop();
            } else {
                curr = peekNode.right;
            }
        }

        return result;
    }
}
