import java.util.ArrayList;
import java.util.List;

/**
 * Topic: Advanced Trees
 *
 * Q9. Lowest Common Ancestor
 *    - Beginner: find root-to-node paths and compare.
 *    - Optimized: single DFS returning node when both sides contain targets.
 *
 * Q10. Boundary traversal
 *    - Beginner: multiple loops for left boundary, leaves, right boundary.
 *    - Optimized: structured DFS collecting boundary in proper order.
 */
public class AdvancedTreeProblems {

    // Q9: LCA (path comparison)
    public static TreeNode lcaPathMethod(TreeNode root, TreeNode p, TreeNode q) {
        // TODO: store paths root->p and root->q, then compare
        return null;
    }

    // Q9: LCA single DFS
    public static TreeNode lcaSingleDFS(TreeNode root, TreeNode p, TreeNode q) {
        // TODO: return root if matches p or q, else search children
        return null;
    }

    // Q10: Boundary traversal
    public static List<Integer> boundaryTraversal(TreeNode root) {
        List<Integer> boundary = new ArrayList<>();
        // TODO: add root, left boundary, leaves, right boundary reversed
        return boundary;
    }
}


