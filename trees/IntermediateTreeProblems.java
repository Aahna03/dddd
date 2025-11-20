import java.util.ArrayList;
import java.util.List;

/**
 * Topic: Intermediate Trees
 *
 * Q6. Diameter of binary tree
 *    - Beginner: compute height for each node separately.
 *    - Optimized: single DFS returning height & tracking diameter.
 *
 * Q7. Check if tree is balanced
 *    - Beginner: compute height for each subtree repeatedly.
 *    - Optimized: DFS returns height or -1 on imbalance.
 *
 * Q8. Right / Left view of tree
 *    - Beginner: nested loops or maps per level.
 *    - Optimized: BFS capturing first/last node per level.
 */
public class IntermediateTreeProblems {

    // Q6: Diameter brute force (height per node) placeholder
    public static int diameterBruteForce(TreeNode root) {
        // TODO: for each node compute left height + right height
        return 0;
    }

    // Q6: Optimized diameter
    public static int diameterOptimized(TreeNode root) {
        // TODO: run DFS that returns height while updating global diameter
        return 0;
    }

    // Q7: Balanced tree check (brute force)
    public static boolean isBalancedBruteForce(TreeNode root) {
        // TODO: compute heights redundantly
        return true;
    }

    // Q7: Optimized balanced check
    public static boolean isBalanced(TreeNode root) {
        // TODO: return false if any subtree imbalance detected
        return true;
    }

    // Q8: Right view using BFS
    public static List<Integer> rightView(TreeNode root) {
        List<Integer> view = new ArrayList<>();
        // TODO: BFS capturing last node per level
        return view;
    }

    // Q8: Left view using BFS
    public static List<Integer> leftView(TreeNode root) {
        List<Integer> view = new ArrayList<>();
        // TODO: BFS capturing first node per level
        return view;
    }
}


