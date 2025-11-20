
import javax.swing.tree.TreeNode;

/**
 * Topic: BST Operations
 *
 * Q4. Delete a node in BST (handle 0/1/2 children cases).
 * Q5. Validate a BST (inorder / min-max range).
 */
public class BSTOperations {

    // Q4: Delete node (recursive)
    public static TreeNode deleteNode(TreeNode root, int key) {
        // TODO: standard BST delete logic (find node, handle cases)
        return root;
    }

    // Helper: find minimum node in subtree
    private static TreeNode minValueNode(TreeNode node) {
        // TODO: return leftmost node
        return node;
    }

    // Q5: Validate BST using inorder (global prev)
    public static boolean isValidBSTInorder(TreeNode root) {
        // TODO: inorder traversal ensuring strictly increasing values
        return true;
    }

    // Q5: Validate BST using min/max bounds
    public static boolean isValidBSTRange(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean validate(TreeNode node, long min, long max) {
        // TODO: ensure node.val in (min, max) range, recurse left/right
        return true;
    }
}


