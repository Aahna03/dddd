
import javax.swing.tree.TreeNode;

/**
 * Topic: BST Basics
 *
 * Q1. Create / insert nodes following BST property.
 * Q2. Search in BST.
 * Q3. Insert a new node (iterative / recursive).
 */
public class BSTBasics {

    // Q1/Q3: Insert value into BST (recursive)
    public static TreeNode insertRecursive(TreeNode root, int val) {
        // TODO: standard BST insert logic
        return root;
    }

    // Q1/Q3: Insert value iteratively
    public static TreeNode insertIterative(TreeNode root, int val) {
        // TODO: handle empty tree and walk down left/right
        return root;
    }

    // Q2: Search (recursive)
    public static TreeNode searchRecursive(TreeNode root, int target) {
        // TODO: use BST property to guide search
        return null;
    }

    // Q2: Search (iterative)
    public static TreeNode searchIterative(TreeNode root, int target) {
        // TODO: iterative while loop using BST property
        return null;
    }

    // Helper: build BST from array (insert sequentially)
    public static TreeNode buildBST(int[] values) {
        TreeNode root = null;
        for (int val : values) {
            root = insertRecursive(root, val);
        }
        return root;
    }
}


