/**
 * Topic: Tree Basics
 *
 * Q1. Create & represent a binary tree
 *    - Beginner: manual node creation + pointers.
 *    - Optimized: helper methods to build from array or traversal.
 *
 * Q2. Height / Depth of a tree
 *    - Beginner: simple recursive depth calculation.
 *    - Optimized: reuse DFS pattern returning height.
 *
 * Q3. Count nodes / leaf nodes
 *    - Beginner: traverse entire tree and increment counters separately.
 *    - Optimized: single DFS returning counts via pair/object.
 */
public class TreeBasics {

    // Q1: simple manual creation (placeholder)
    public static TreeNode createSampleTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        return root;
    }

    // Q2: height using recursion
    public static int height(TreeNode root) {
        // TODO: compute max depth
        return 0;
    }

    // Q3: count total nodes
    public static int countNodes(TreeNode root) {
        // TODO: return number of nodes via recursion
        return 0;
    }

    // Q3: count leaf nodes
    public static int countLeaves(TreeNode root) {
        // TODO: count nodes with no children
        return 0;
    }

    // Optional combined method returning both counts
    public static class CountInfo {
        public int totalNodes;
        public int leafNodes;
    }

    public static CountInfo countNodesAndLeaves(TreeNode root) {
        // TODO: single DFS returning counts
        return new CountInfo();
    }
}


