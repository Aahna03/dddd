import java.util.ArrayList;
import java.util.List;
import javax.swing.tree.TreeNode;

/**
 * Topic: Intermediate BST Problems
 *
 * Q6. Kth smallest / largest element.
 * Q7. Floor & ceil in BST.
 */
public class IntermediateBSTProblems {

    // Q6: Kth smallest via inorder storing list (beginner)
    public static int kthSmallestBrute(TreeNode root, int k) {
        List<Integer> inorder = new ArrayList<>();
        // TODO: fill inorder list (left-root-right) and return k-1 element
        return -1;
    }

    // Q6: Kth smallest optimized (counter)
    public static int kthSmallestOptimized(TreeNode root, int k) {
        // TODO: inorder traversal that stops once counter reaches k
        return -1;
    }

    // Q6: Kth largest similar logic
    public static int kthLargestOptimized(TreeNode root, int k) {
        // TODO: reverse inorder (right-root-left) with counter
        return -1;
    }

    // Q7: Floor (greatest value <= key)
    public static Integer floorBST(TreeNode root, int key) {
        // TODO: traverse, update floor candidate, go left/right based on key
        return null;
    }

    // Q7: Ceil (smallest value >= key)
    public static Integer ceilBST(TreeNode root, int key) {
        // TODO: similar logic for ceil
        return null;
    }
}


