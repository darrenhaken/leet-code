package binarytree;

public class MaxDepth {

    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return maxDepth(root, 0);
    }

    private int maxDepth(TreeNode node, int depth) {
        if(node == null) {
            return depth;
        }

        return Math.max(maxDepth(node.left, depth + 1), maxDepth(node.right, depth + 1));
    }
}
